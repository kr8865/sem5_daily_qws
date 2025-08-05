// Last updated: 8/5/2025, 7:52:55 PM
// lowest_ancestor
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(right!=null && left!=null){
            return root;
        }
        else if(left==null){
            return right;
        }
        else if(right==null){
            return left;
        }
        return null;
        
    }
   
}