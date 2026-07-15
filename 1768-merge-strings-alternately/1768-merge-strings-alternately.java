class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i =0 ;
        String ans = "";
        int minlen = Math.min(word1.length() ,word2.length());
        while(i < minlen){
            ans = ans+word1.charAt(i)+word2.charAt(i);
            i++;      
        }
        if(i< word1.length()){
            ans =ans+word1.substring(i);
        }
        else if(i<word2.length()){
           ans = ans+word2.substring(i);
        }
        return ans;
    }
}