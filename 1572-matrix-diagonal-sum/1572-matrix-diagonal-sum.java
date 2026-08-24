class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<mat.length;i++){
              sum+=mat[i][i];
        }
       int a=0;
       if(n%2==0){
         for(int j = mat.length - 1; j >= 0; j--) {
            a += mat[j][n-1-j];
        }
       }
       if(n%2!=0) {
            for(int j = mat.length - 1; j >= 0; j--) {
                if(j==n/2){
                    continue;
                }
            a += mat[j][n-1-j];
        }
       }
       
        return sum+a;
    }
}