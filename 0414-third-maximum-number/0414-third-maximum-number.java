class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int cout = -1;
        int num[] = new int[nums.length];

        HashSet<Integer> lh = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!lh.contains(nums[i])){
                lh.add(nums[i]);
                cout++;
                num[cout] = nums[i];
            }
        }

        int length = cout + 1;

        if(length == 1){
            return num[0];
        }

        if(length == 2){
            return num[1];
        }

        if(length == 3){
            return num[0];
        }

        if(length > 3){
            return num[length - 3];
        }

        return 0;
    }
}