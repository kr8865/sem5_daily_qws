// Last updated: 8/7/2025, 12:15:32 PM
// valid_bst
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
    public boolean isValidBST(TreeNode root) {
        return validBST(root).isbst;


        
    }
    static class Bst {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        boolean isbst = true;

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
        sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
        return sbp;

    }
}