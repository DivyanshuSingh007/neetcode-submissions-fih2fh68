class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            int last = -1;
            for(int i = 0; i < n; i++){
                TreeNode k = q.poll();
                last = k.val;

                if(k.left != null) q.add(k.left);
                if(k.right != null) q.add(k.right);
            }
            ans.add(last);
        }
        return ans;
    }
}
