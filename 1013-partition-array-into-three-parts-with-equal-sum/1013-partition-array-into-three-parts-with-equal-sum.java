class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalsum = 0;
        for(int num:arr) totalsum+= num;
        if(totalsum % 3 != 0) return false;

        int target =totalsum/3;
        int currentsum=0;
        int count=0;
        for(int num:arr){
            currentsum+=num;
            if(currentsum == target){
                count++;
                currentsum=0;
            }
        }
        return count>=3;
    }
}