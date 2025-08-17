// Last updated: 8/17/2025, 10:27:04 AM
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
    public int maxSumBST(TreeNode root) {
        return validBST(root).ans;
        
    }
    static class Bst {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        boolean isbst = true;
        int sum = 0;
        int ans = 0;// only bst part ka sum

    }
    public Bst validBST(TreeNode root) {
        if (root == null) {
            return new Bst();
        }
        Bst lbp = validBST(root.left);
        Bst rbp = validBST(root.right);
        Bst sbp = new Bst();
        sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
        sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
        sbp.sum = lbp.sum + rbp.sum + root.val;
        sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
        if (sbp.isbst) {
            sbp.ans = Math.max(lbp.ans, Math.max(rbp.ans, sbp.sum));
        } else {
            sbp.ans = Math.max(lbp.ans, rbp.ans);

        }
        return sbp;

    }
}