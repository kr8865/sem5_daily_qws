// Last updated: 7/31/2025, 2:05:32 PM
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
    public int diameterOfBinaryTree(TreeNode root) {
        int c=diameter(root);
        return c;
        
    }
    public static int diameter(TreeNode root){
        if(root==null){
            return 0;
        }
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int slf=lh+rh;
        return Math.max(slf,Math.max(ld,rd));
    }
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int ll=height(root.left);
        int rr=height(root.right);
        return Math.max(ll,rr)+1;

    }
}