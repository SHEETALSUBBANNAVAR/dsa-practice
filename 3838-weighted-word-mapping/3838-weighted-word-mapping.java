class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
    
        String s1= "";
        for (String word : words) {

            int sum = 0;
            char ch = ' ';
            for (int i=0;i<word.length();i++) {

                ch = word.charAt(i);
                sum += weights[ch - 'a'];
            }

            int rem = sum % 26;
            s1+= (char)('z' - rem);
        }
        return s1;
    }
}