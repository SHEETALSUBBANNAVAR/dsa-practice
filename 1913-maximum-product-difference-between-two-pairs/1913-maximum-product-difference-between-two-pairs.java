class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int firstproduct = nums[0]*nums[1];
        int lastproduct = nums[nums.length-1]*nums[nums.length-2];
        return lastproduct -firstproduct ;

    }
}