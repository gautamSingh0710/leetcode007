class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list =new ArrayList<>();
        generate(list,n,0,0,"");
        return list;
        
    }
    public static void generate(List<String>list,int n,int open,int close,String str){
        if(str.length()==(2*n)){
            list.add(str);
            return;

        }
        if(open<n){
            generate(list,n,open+1,close,str+"(");

        }
        if(close<open){
            generate(list,n,open,close+1,str+")");
        }
    }
}