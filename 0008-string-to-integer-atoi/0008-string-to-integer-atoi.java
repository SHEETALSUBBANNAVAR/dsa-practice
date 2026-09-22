class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int num=0;
        int sign =1;
        boolean signFound = false;
        boolean numberStarted = false;

        for(int i=0;i<s.length();i++){
           
           char c = s.charAt(i);
            if (!signFound && !numberStarted && c== '-'){
                sign =-1;
                signFound=true;
                
                continue;
            }else if(!signFound && !numberStarted && c== '+' ){
                sign =1;
                signFound=true;
                continue;
            }
           if (c >= '0' && c <= '9') {
                numberStarted = true;
                
                int digit = c - '0';

                if (num > 214748364 || num == 214748364 && digit > 7) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                num = num * 10 + digit;
            }
            else{
                break;
            }
        }
        return num*sign;
    }
}