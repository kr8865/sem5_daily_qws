// Last updated: 7/31/2025, 2:07:39 PM
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
        int c=depth(root);
        return c;
        
    }
    public static int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=depth(root.left);
        int rh=depth(root.right);
        if(root.left==null){
            return rh+1;
        }
        if(root.right==null){
            return lh+1;
        }
        return Math.min(lh,rh)+1;
    }
}