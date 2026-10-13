class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];

        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);

        long sum1 = 0;
        long sum2 = 0;

        for (int i = 0; i < n / 2; i++) {
            sum1 += squares[i];
        }

        for (int i = n / 2; i < n; i++) {
            sum2 += squares[i];
        }

        return sum2 - sum1;
    }
}