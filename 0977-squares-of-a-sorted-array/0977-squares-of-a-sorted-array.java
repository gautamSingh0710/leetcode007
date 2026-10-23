class Solution {
    public int[] sortedSquares(int[] nums) {
        int sum[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum[i]=nums[i]*nums[i];
        }
        Arrays.sort(sum);
        return sum;
    }
}