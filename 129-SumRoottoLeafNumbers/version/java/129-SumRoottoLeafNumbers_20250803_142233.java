// Last updated: 8/3/2025, 2:22:33 PM
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
    public int sumNumbers(TreeNode root) {
        return number(root,0);

        
    }
    public static int number(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        
        if(root.left==null && root.right==null){
            return sum*10+root.val;
        }





        int lnum=number(root.left,sum*10+root.val);
        int rnum=number(root.right,sum*10+root.val);
        return lnum+rnum;
    }
}