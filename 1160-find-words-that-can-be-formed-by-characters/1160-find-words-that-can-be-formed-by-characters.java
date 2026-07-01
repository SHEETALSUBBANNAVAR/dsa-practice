class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap < Character , Integer> map1 = new HashMap<>();
        for(int i=0;i<chars.length();i++){
            map1.put(chars.charAt(i),map1.getOrDefault(chars.charAt(i),0)+1);
        }
        int ans = 0;

      
        for (String word : words) {
            HashMap<Character, Integer> temp = new HashMap<>(map1);
            boolean possible = true;
            for (int i=0;i<word.length();i++) {
                if (temp.getOrDefault(word.charAt(i), 0) == 0) {
                    possible = false;
                    break;
                }
                temp.put(word.charAt(i), temp.get(word.charAt(i)) - 1);
            }

            if (possible) {
                ans += word.length();
            }
        }
        return ans ;
        
    }
}