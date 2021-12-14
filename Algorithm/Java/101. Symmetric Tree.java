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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true; // both empty
        else if (p == null || q == null) return false; // 1 empty 1 not
        else if (p.val == q.val){ // both not empty and val equal
            return compare(p.left, q.right) && compare(p.right, q.left); // !!!!!左右交叉比较
        }
        return false; // both not empty but have different val
    }
}
