class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }
return ans;
    }
}