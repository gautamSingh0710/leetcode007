class Solution { 
    public int minEatingSpeed(int[] piles, int h) { 
        
        int n = piles.length; 
        
        int max = Integer.MIN_VALUE; 
        
        for(int i = 0; i < n; i++){ 
            if(piles[i] > max){ 
                max = piles[i]; 
            } 
        } 
        
        int low = 1;
        int high = max;
        
        while(low < high){
            
            int mid = low + (high - low) / 2;
            
            long hours = 0;
            
            for(int pile : piles){
                hours += (pile + mid - 1) / mid;
            }
            
            if(hours <= h){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        
        return low;
    } 
}