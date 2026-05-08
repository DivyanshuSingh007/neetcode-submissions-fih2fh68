/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private int helper(TreeNode root, int x){
        if(root == null) return 0;
        int good = (root.val >= x) ? 1 : 0;
        return good + helper(root.left, Math.max(x, root.val)) + helper(root.right, Math.max(x, root.val));
    }
    public int goodNodes(TreeNode root) {
        return helper(root, root.val);
    }
}
