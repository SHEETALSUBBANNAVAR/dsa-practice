class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        
        int lowerbond =0 ;
        int upperbond= nums.length;
        lowerbond = lower(nums,lowerbond,target);
        upperbond = upper(nums,upperbond,target);
        return new int[]{lowerbond,upperbond};
    }
    public int lower(int [] nums,int lowerbond,int target){
        int i =0;
        while(i<=nums.length-1){
            if(nums[i] == target) return i;
            i++;
        }return -1;
    }
     public int upper(int [] nums,int upperbond,int target){
        int i =nums.length-1;
        while(i>=0){
            if(nums[i] == target) return i;
            i--;
        }return -1;
     }
    
}