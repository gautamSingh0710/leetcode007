class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        solve(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    void solve(String s, int start, List<String> temp, List<List<String>> ans) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String str = s.substring(start, i + 1);

            if (new StringBuilder(str).reverse().toString().equals(str)) {
                temp.add(str);
                solve(s, i + 1, temp, ans);
                temp.remove(temp.size() - 1);
            }
        }
    }
}