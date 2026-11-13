class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(!st.isEmpty() && Math.abs(st.peek() - ch) == 32) {
                st.pop();
            }
            else {
                st.push(ch);
            }
        }

        while(!st.isEmpty()) {
            res.append(st.pop());
        }

        return res.reverse().toString();
    }
}

