class Solution {
    public int largestAltitude(int[] gain) {
        int maxgain=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum = sum + gain[i];
            maxgain =Math.max(maxgain,sum);
        }return maxgain;
    }
}