// Last updated: 9/24/2025, 10:12:12 PM
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
    public boolean isUnivalTree(TreeNode root) {
        int val=root.val;
        return value(root,val);

        
        
    }
    public static boolean value(TreeNode root,int data){
        if(root==null){
            return true;
        }
        if(root.val!=data){
            return false;
        }
        
        boolean l=value(root.left,data);
        
        boolean r=value(root.right,data);
        
        
        return l&& r;
    }
}