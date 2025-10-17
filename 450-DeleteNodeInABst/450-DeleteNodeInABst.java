// Last updated: 10/17/2025, 8:04:45 PM
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
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root,key);
        
        
    }
    public static int maxa(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int da = maxa(root.right);
        return Math.max(da, root.val);

    }
    public static TreeNode delete(TreeNode root,int key){
        if(root==null){
            return null;
        }
        if(root.val<key){
            root.right=delete(root.right,key);
        }
        else if(root.val>key){
            root.left=delete(root.left,key);
        }
        else{
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;

            } else {
                int maxv=maxa(root.left);
                root.left=delete(root.left, maxv);
                root.val=maxv;

            }
            
           
            
        }
        return root;
        

    }
     

}