import java.util.*;

class Solution {

    Set<List<Integer>> properSet = new HashSet<>();
    List<Integer> subset = new ArrayList<>();

    public void sG(int[] arr, int idx) {
        if (idx == arr.length) {
            properSet.add(new ArrayList<>(subset));
            return;
        }

        // Include
        subset.add(arr[idx]);
        sG(arr, idx + 1);

        // Exclude
        subset.remove(subset.size() - 1);
        sG(arr, idx + 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);      // Important
        sG(nums, 0);
        return new ArrayList<>(properSet);
    }
}