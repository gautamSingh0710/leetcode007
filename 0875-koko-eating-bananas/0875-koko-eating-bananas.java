class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         Arrays.sort(piles);
         int n=piles.length;
       int low =1;
       int high=piles[n-1];
       while(low<high){
       int mid=low+(high-low)/2;
       
       long sum=0;
       for(int pile:piles){
       sum += (pile + mid-1)/mid;
       }
        if(sum<=h){
           high=mid;
        }
        else{
           low= mid+1;
        }
       
       }
return low;
    }
}