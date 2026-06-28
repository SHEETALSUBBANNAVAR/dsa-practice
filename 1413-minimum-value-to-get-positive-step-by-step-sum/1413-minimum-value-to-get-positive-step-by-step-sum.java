class Solution {
    public int minStartValue(int[] nums) {
       int minpri=  0; 
       int sum=0;
       for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
        minpri=Math.min(minpri , sum);
       } 
       return 1-minpri;
    }
}