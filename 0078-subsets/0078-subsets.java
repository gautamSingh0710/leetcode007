class Solution {
    List<List<Integer>>properset=new ArrayList<>();
    List<Integer>subset=new ArrayList<>();
    public void sg(int[]arr,int idx){
        if(idx==arr.length){
            properset.add(new ArrayList(subset));
            return;
        }
        subset.add(arr[idx]);
        sg(arr,idx+1);
        subset.remove(subset.size()-1);
        sg(arr,idx+1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        sg(nums,0);
        return properset;
    }
}