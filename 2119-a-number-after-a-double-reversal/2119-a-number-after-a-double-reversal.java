class Solution {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int newval = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 ||
                    (rev == Integer.MAX_VALUE / 10 && newval > 7))
                return 0;

            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && newval < -8))
                return 0;
            rev = (rev * 10 + newval);
        }
        return (rev);
    }

    public boolean isSameAfterReversals(int num) {
        int reversedNumber = reverse(num);
        int doubleReversedNumber = reverse(reversedNumber);
        return num == doubleReversedNumber;

    }
}