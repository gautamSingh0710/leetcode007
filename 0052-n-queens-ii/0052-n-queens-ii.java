class Solution {
     int ans=0;
        boolean[] col;
        boolean[] uppright;
        boolean[] upperleft;
    public void HELPER(int n,int row){
     if(row==n){
       ans++;
       return;}
 
        for(int c=0;c<n;c++){
            if(col[c] || upperleft[row+c] || uppright[row-c+(n-1)]){
                continue;
            }
        
            col[c]=true;
            upperleft[row+c]=true;
            uppright[row-c+(n-1)]=true;
            HELPER(n,row+1);
          
            col[c]=false;
            upperleft[row+c]=false;
            uppright[row-c+(n-1)]=false;

        }

    }

    
    public int totalNQueens(int n) {
        col =new boolean[n];
        upperleft=new boolean[2*n-1];
        uppright=new boolean[2*n-1];
     
        HELPER(n,0);

        return ans;

    }
}