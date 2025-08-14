// Last updated: 8/14/2025, 9:56:17 PM
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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ll =new ArrayList<>();
        inorder(root,ll);
        for(int i=0;i<ll.size();i++){
            if(i==k-1){
                return ll.get(i);
            }
        }
        return -1;
        
    }
    public static void inorder(TreeNode root,ArrayList<Integer> ll){
        if(root==null){
            return;
        }
        inorder(root.left,ll);
        ll.add(root.val);
        inorder(root.right,ll);

    }
}