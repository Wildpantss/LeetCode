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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true; // situation1: both empty
        else if (p == null || q == null) return false; // situation2: 1 empty 1 not
        else { // situation3: both not empty
            if (p.val == q.val) { // equal value
                // if (left and right of the 2 nodes are all the same, return true, otherwise return false)
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
            else return false; // not equal
        }
    }
}