class Solution {
    public boolean isDigitorialPermutation(int n) {
        int sum =0;
        int original = n;;
        while( n > 0){
            int fact = 1;
            for (int i = 1; i <= n%10; i++){
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
       HashMap<Integer, Integer> mp = new HashMap<>();
        int temp = sum;
        while (temp > 0) {
            int digit = temp % 10;
            mp.put(digit, mp.getOrDefault(digit, 0) + 1);
            temp /= 10;
        }

        temp = original;
        while (temp > 0) {
            int digit = temp % 10;

            if (!mp.containsKey(digit)) {
                return false;
            }

            mp.put(digit, mp.get(digit) - 1);

            if (mp.get(digit) == 0) {
                mp.remove(digit);
            }

            temp /= 10;
        }
        return mp.isEmpty();
    }
}