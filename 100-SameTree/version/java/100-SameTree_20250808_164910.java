// Last updated: 8/8/2025, 4:49:10 PM
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        else{
           return  issame(p,q);
        }
        
    }
    public static boolean issame(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null && q!=null || p!=null && q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        boolean lh=issame(p.left,q.left);
        boolean rh=issame(p.right,q.right);
        return lh && rh;
    }
    
}