class Solution {
    boolean [][]rowmap;
    boolean [][]colmap;
    boolean [][]boxmap;
    public void solveSudoku(char[][] board) {
        rowmap=new boolean[9][9];
        colmap=new boolean[9][9];
        boxmap=new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                int idx=board[i][j]-'1';
                int box=i/3*3+j/3;
                rowmap[i][idx]=true;
                colmap[j][idx]=true;
                boxmap[box][idx]=true;
            }
        } 
        solve(board);
    }
   boolean solve(char [][]board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    continue;
                }
                int box=i/3*3+j/3;
                for(char k='1';k<='9';k++){
                    int idx=k-'1';
                    if(!rowmap[i][idx] && !colmap[j][idx] && !boxmap[box][idx]){
                        board[i][j]=k;
                        rowmap[i][idx]=true;
                        colmap[j][idx]=true;
                        boxmap[box][idx]=true;
                       if( solve(board)) return true;
                        board[i][j]='.';
                        rowmap[i][idx]=false;
                        colmap[j][idx]=false;
                        boxmap[box][idx]=false;
                    }
                }
                return false;
            }
        }
        return true;
    }
}