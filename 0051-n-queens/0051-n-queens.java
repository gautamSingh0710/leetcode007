class Solution {
        List<List<String>>ans=new ArrayList<>();
        boolean[] col;
        boolean[] uppright;
        boolean[] upperleft;
    public void HELPER(int n,int row,char board[][]){
     if(row==n){
        List<String> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            temp.add(new String(board[i]));
        }
        ans.add(temp);
        
     }
        for(int c=0;c<n;c++){
            if(col[c] || upperleft[row+c] || uppright[row-c+(n-1)]){
                continue;
            }
            board[row][c]='Q';
            col[c]=true;
            upperleft[row+c]=true;
            uppright[row-c+(n-1)]=true;
            HELPER(n,row+1,board);
            board[row][c]='.';
            col[c]=false;
            upperleft[row+c]=false;
            uppright[row-c+(n-1)]=false;

        }

    }

    
    public List<List<String>> solveNQueens(int n) {
        col =new boolean[n];
        upperleft=new boolean[2*n-1];
        uppright=new boolean[2*n-1];
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        HELPER(n,0,board);

        return ans;

    }
}