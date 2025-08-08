// Last updated: 8/8/2025, 4:02:35 PM
// merge_two_binary_tree
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1,root2);
        
    }
    public static TreeNode merge(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){
            return null;

        }
        if(root1==null && root2==null){
            return null;

        }

        if(root1==null && root2!=null){
            return root2;
        }
        if(root1!=null && root2==null){
            return root1;
        }
        int val1=root1.val+root2.val;
        TreeNode newnode=new TreeNode(val1);
        newnode.left=merge(root1.left,root2.left);
        newnode.right=merge(root1.right,root2.right);
        return newnode;
    }
}