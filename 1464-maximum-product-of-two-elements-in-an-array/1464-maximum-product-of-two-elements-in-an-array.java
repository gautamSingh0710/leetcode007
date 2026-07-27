class Solution {
    public int maxProduct(int[] nums) {
        int m=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(m<nums[i]){
                s=m;
                m=nums[i];
            }
            else if(nums[i]>s){
                s=nums[i];
            }
        }
        return (m-1)*(s-1);
    }
}