// Last updated: 10/17/2025, 8:04:27 PM
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
    Integer prev = null;   // To store the previous node's value during inorder traversal
    int minDiff = Integer.MAX_VALUE; // To store the minimum difference

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    // Inorder traversal to get sorted order of BST
    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev);
        }
        prev = node.val;

        inorder(node.right);
    }
}
