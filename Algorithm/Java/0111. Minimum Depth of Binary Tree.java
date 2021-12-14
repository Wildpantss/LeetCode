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
    public int minDepth(TreeNode root) {
        
        if (root == null) return 0;
        
        // not empty
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        // when both not empty, choose min; when one of the two is empty sub tree, use sum (for sum is 0 + the other one's depth)
        return (leftDepth != 0 && rightDepth != 0) ? Math.min(leftDepth, rightDepth) + 1 : leftDepth + rightDepth + 1;
    }
}