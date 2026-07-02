class Solution {
    public int strStr(String haystack, String needle) {
       
        for(int i=0;i<=haystack.length()-  needle.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                String s = haystack.substring(i,i+needle.length());
                if(s.equals(needle)){
                    return i ;
                }
            }
        }
        return -1;
    }
}