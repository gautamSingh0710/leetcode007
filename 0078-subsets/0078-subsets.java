class Solution {
    List<List<Integer>>properset=new ArrayList<>();
    List<Integer>subset=new ArrayList<>();
    public void sg(int[]arr,int idx,int start){
        if(idx==arr.length || start==arr.length){
            properset.add(new ArrayList(subset));
            return;
        }
        for(int i=start;i<arr.length;i++){
        subset.add(arr[i]);
        sg(arr,idx+1,i+1);
        subset.remove(subset.size()-1);
        }
        properset.add(new ArrayList(subset));
    }

    public List<List<Integer>> subsets(int[] nums) {
        sg(nums,0,0);
        return properset;
    }
}