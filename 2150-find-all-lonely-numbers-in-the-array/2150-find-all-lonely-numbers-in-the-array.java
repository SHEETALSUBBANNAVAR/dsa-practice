class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap <Integer ,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
         for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1 &&
                !map.containsKey(key - 1) &&
                !map.containsKey(key + 1)) {

                ans.add(key);
            }
        }return ans;
    }
}