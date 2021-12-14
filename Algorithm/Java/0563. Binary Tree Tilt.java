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

    int sum = 0;

    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        calcSum(root);
        return this.sum;
    }


    private int calcSum(TreeNode root) { // returns current sub tree's sum, the sum of tilt stored in class field sum.
        if (root == null) return 0;
        int left = calcSum(root.left);
        int right = calcSum(root.right);
        this.sum += Math.abs(left - right);
        return left + right + root.val;
    }
}
