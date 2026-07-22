import java.util.*;

class Solution {

    public int maxActiveSectionsAfterTrade(String s) {

        String d = "1" + s + "1";
        char[] ch = d.toCharArray();

        // Make blocks
        ArrayList<String> blocks = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        sb.append(ch[0]);

        for (int i = 1; i < ch.length; i++) {

            if (ch[i] == ch[i - 1]) {
                sb.append(ch[i]);
            } else {
                blocks.add(sb.toString());
                sb = new StringBuilder();
                sb.append(ch[i]);
            }
        }

        blocks.add(sb.toString());

        // Count original ones
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }

        int ans = ones;

        // Try every surrounded 1-block
        for (int i = 1; i < blocks.size() - 1; i++) {

            if (blocks.get(i).charAt(0) == '1'
                    && blocks.get(i - 1).charAt(0) == '0'
                    && blocks.get(i + 1).charAt(0) == '0') {

                int gain = blocks.get(i - 1).length()
                         + blocks.get(i + 1).length();

                ans = Math.max(ans, ones + gain);
            }
        }

        return ans;
    }
}