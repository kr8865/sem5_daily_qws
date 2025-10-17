// Last updated: 10/17/2025, 8:06:45 PM
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
    public boolean isBalanced(TreeNode root) {
        // Agar -1 return hota hai toh tree unbalanced hai
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode root) {
        if (root == null) {
            return 0; // null ka height = 0
        }

        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1) return -1; // Left unbalanced

        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1) return -1; // Right unbalanced

        // Agar height difference > 1 hai toh unbalanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // Otherwise height return karo
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
