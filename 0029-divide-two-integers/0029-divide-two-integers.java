class Solution {
    public int divide(int dividend, int divisor) {
        int a=dividend;
        int b=divisor;
           if (a == Integer.MIN_VALUE && b == -1)
            return Integer.MAX_VALUE;

        boolean neg = (a < 0) ^ (b < 0);
        long x = Math.abs((long)a), y = Math.abs((long)b);
        long ans = 0;

        while (x >= y) {
            long t = y, m = 1;

            while ((t << 1) <= x) {
                t <<= 1;
                m <<= 1;
            }

            x -= t;
            ans += m;
        }

        return (int)(neg ? -ans : ans);
    }
}