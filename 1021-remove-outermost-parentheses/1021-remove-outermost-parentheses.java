class Solution {
    public String removeOuterParentheses(String s) {
       String ans="";
       int open=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch == '(' && open++ >0) {
                ans+=ch;    
            }else if(ch == ')' && open-- >1) {
                ans+=ch;   
            }     
        }return ans;
    }
}