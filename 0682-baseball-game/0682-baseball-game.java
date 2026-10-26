import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;

        for (int i = 0; i < operations.length; i++) {
            if (!operations[i].equals("+") &&
                !operations[i].equals("D") &&
                !operations[i].equals("C")) {

                st.push(Integer.parseInt(operations[i]));
            }
            else {
                if (operations[i].equals("C")) {
                    st.pop();
                }

                if (operations[i].equals("D")) {
                    int top = st.peek();
                    st.push(top * 2);
                }

                if (operations[i].equals("+")) {
                    int top = st.pop();
                    int top2 = st.pop();

                    st.push(top2);
                    st.push(top);
                    st.push(top + top2);
                }
            }
        }

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}