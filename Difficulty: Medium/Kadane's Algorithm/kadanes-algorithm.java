class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int sum=0;
        int maxsum=arr[0];
        
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            maxsum=Math.max(maxsum ,sum);
            if(sum<0)sum=0;
        }return maxsum;
    }
}
