class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int sec = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit > max) {
                sec = max;
                max = digit;
            } else if (digit > sec) {
                sec = digit;
            }

            n /= 10;
        }

        return max * sec;
    }
}