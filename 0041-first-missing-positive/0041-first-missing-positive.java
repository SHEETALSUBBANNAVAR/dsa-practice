class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int ans =1;
        while(i<nums.length){
            int ci = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[ci]!= nums[i] ){
                int temp = nums[i];
                nums[i]=nums[ci];
                nums[ci]=temp ;
            }else {
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i] != i+1)
               return i+1;

        }return nums.length+1; 
    }
}