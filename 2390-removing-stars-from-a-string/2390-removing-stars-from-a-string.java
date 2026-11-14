class Solution {
    public String removeStars(String s) {
        StringBuilder res=new StringBuilder();
        int c=0;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
               
            }
        }
        while(!st.isEmpty()){
            res.append((char)st.pop());
        }
        return res.reverse().toString();
    }
}