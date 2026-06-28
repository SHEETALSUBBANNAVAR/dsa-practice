class Solution {
    int missingNum(int arr[]) {
        // code here
        long  sum=0;
        int n=arr.length;
        for(int num :arr){
            sum=sum+num;
        }
         long expected = (long) (n + 1) * (n + 2) / 2;
       
        return (int) (expected-sum);
    
    }
}