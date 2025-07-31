// Last updated: 7/31/2025, 2:05:55 PM
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
    static int lh=0;
    public int sumOfLeftLeaves(TreeNode root) {
        lh=0;
        sum(root);
        return lh;
        
    }
    
    public static void sum(TreeNode root){
        if(root==null){
            return ;
        }
        
        if(root.left!=null && root.left.left==null && root.left.right==null){
            lh=lh+root.left.val;
        }
        sum(root.left);
        sum(root.right);
        
        
    }
}