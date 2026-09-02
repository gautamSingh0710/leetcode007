import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                switch (ch) {

                    case ')':
                        if (top != '(') {
                            return false;
                        }
                        break;

                    case '}':
                        if (top != '{') {
                            return false;
                        }
                        break;

                    case ']':
                        if (top != '[') {
                            return false;
                        }
                        break;
                }
            }
        }

        return st.isEmpty();
    }
}