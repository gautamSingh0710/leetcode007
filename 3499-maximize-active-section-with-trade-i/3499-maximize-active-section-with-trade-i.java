class Solution {
    public int maxActiveSectionsAfterTrade(String s) {

        String t = "1" + s + "1";
        int n = t.length();

        int[] len = new int[n];
        char[] type = new char[n];
        int blocks = 0;

        // Make blocks
        int i = 0;
        while (i < n) {
            char c = t.charAt(i);
            int j = i;

            while (j < n && t.charAt(j) == c) {
                j++;
            }

            type[blocks] = c;
            len[blocks] = j - i;
            blocks++;

            i = j;
        }

        // Count original ones
        int ones = 0;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }

        int ans = ones;

        // Try every surrounded 1-block
        for (i = 1; i < blocks - 1; i++) {

            if (type[i] == '1' &&
                type[i - 1] == '0' &&
                type[i + 1] == '0') {

                int gain = len[i - 1] + len[i + 1];
                ans = Math.max(ans, ones + gain);
            }
        }

        return ans;
    }
}