class Solution {
    public int maxBalancedShipments(int[] weight) {
        int count =0;
        int max =0;
        for (int x : weight) {
            max = Math.max(max, x);

            if (x < max) {
                count++;
                max = 0;
            }
        }

        return count;
    }
}