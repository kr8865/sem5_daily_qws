// Last updated: 7/31/2025, 2:07:22 PM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        traversal(root,ll);
        return ll;
        
    }
    public static void traversal(TreeNode root,List<Integer> ll){
        if(root==null){
            return;
        }
        
        traversal(root.left,ll);
        traversal(root.right,ll);
        ll.add(root.val);
        
    }
}