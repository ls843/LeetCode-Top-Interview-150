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
    public int maxPathSum(TreeNode root) {
        int pathSum[] = new int[1];
        pathSum[0] = Integer.MIN_VALUE;
        calculatePathSum(root, pathSum);
        return pathSum[0];
    }

    private int calculatePathSum(TreeNode root, int[] pathSum) {
        if(root == null) return 0;

        int leftSum[] = new int[1];
        int rightSum[] = new int[1];

        leftSum[0] = Math.max(0, calculatePathSum(root.left, pathSum));
        rightSum[0] = Math.max(0,calculatePathSum(root.right, pathSum));

        pathSum[0] = Math.max(pathSum[0], root.val + leftSum[0] + rightSum[0]);

        return Math.max(leftSum[0],rightSum[0]) + root.val;
    }
}