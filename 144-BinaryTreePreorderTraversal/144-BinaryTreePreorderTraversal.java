// Last updated: 7/31/2025, 2:07:23 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        traversal(root,ll);
        return ll;
        
    }
    public static void traversal(TreeNode root,List<Integer> ll){
        if(root==null){
            return;
        }
        ll.add(root.val);
        traversal(root.left,ll);
        traversal(root.right,ll);
    }
}