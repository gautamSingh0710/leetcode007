class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int a=0;
        for(int i=0;i<=nums.length;i++){
            sum+=i;
            }
            for(int i=0;i<nums.length;i++){
            a+=nums[i];
            }
        
        
        return sum-a;
    }   
  
}