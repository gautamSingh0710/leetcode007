class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> li = new ArrayList<>();

        if (root == null)
            return li;

        Queue<TreeNode> que = new LinkedList<>();

        que.add(root);
        que.add(null);

        List<Integer> l = new ArrayList<>();

        while (!que.isEmpty()) {

            TreeNode temp = que.poll();

            if (temp == null) {

                li.add(l);
                l = new ArrayList<>();
                if (!que.isEmpty()) {
                    que.add(null);
                }
                continue;
            }
            l.add(temp.val);

            if (temp.left != null) {
                que.add(temp.left);
            }

            if (temp.right != null) {
                que.add(temp.right);
            }
        }
        return li;
    }
}