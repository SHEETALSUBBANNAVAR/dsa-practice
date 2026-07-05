class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int max =1;
        Arrays.sort(arr);
        if(arr[0] != 1 ) arr[0]=1;
        for(int i = 0;i<arr.length -1 ;i++){
            
            if(arr[i] <= arr[i+1] && (arr[i] == arr[i]+1 ||arr[i] == arr[i+1]) ){
                max = Math.max(max,arr[i+1]);
            }else {
                arr[i+1] = arr[i]+1;
                max = Math.max(max,arr[i+1]);
            }
        }return max;
    }
}