// Last updated: 8/17/2025, 10:26:17 AM
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
    int max=Integer.MIN_VALUE;;
    public int maxPathSum(TreeNode root) {
        if(root.left==null && root.right==null){
            return root.val;
        }
        int val=maxPathSum1(root);
        
        return max;
        
        
    }
    public int maxPathSum1(TreeNode root){
        if(root==null){
            return 0;
        }
        int lsum=Math.max(0,maxPathSum1(root.left));
        int rsum=Math.max(0,maxPathSum1(root.right));
        max=Math.max(max,lsum+rsum+root.val);
        return Math.max(lsum,rsum)+root.val;

    }
}