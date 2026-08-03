class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    void helper(int[] can, int target, int start,
                List<Integer> currList,
                List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currList));
            return;
        }
       if(target<0)return;
        for (int i = start; i < can.length; i++) {
            if (can[i] > target)break;
            if(i>start && can[i]==can[i-1])continue;
            
            currList.add(can[i]);

            helper(can, target - can[i], i+1, currList, result);

            currList.remove(currList.size() - 1);
        }
    }
}