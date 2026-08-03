class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits == null || digits.length() == 0)
            return ans;

        String[] map = {
                "", "",
                "abc", "def", "ghi",
                "jkl", "mno", "pqrs",
                "tuv", "wxyz"
        };

        helper(digits, 0, new StringBuilder(), ans, map);
        return ans;
    }

    void helper(String digits, int index, StringBuilder curr,
                List<String> ans, String[] map) {

        if (index == digits.length()) {
            ans.add(curr.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            curr.append(letters.charAt(i));
            helper(digits, index + 1, curr, ans, map);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}