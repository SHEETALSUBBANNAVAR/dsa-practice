class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 0 ;
        int even = 0 ;
        
         for (int i = 1; i <= n; i++) {
            odd += (2 * i - 1);
            even += (2 * i);
        }
          while (even != 0) {
            int rem = odd % even;
            odd = even;
            even = rem;
        }
        return odd;
    }
}