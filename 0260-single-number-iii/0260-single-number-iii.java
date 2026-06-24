class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        int j = 0;
        int i = 0;
        while (i < nums.length) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                ans[j++] = nums[i];
                i++;
            } else {
                i += 2;
            }
        }
        return ans;
    }
}