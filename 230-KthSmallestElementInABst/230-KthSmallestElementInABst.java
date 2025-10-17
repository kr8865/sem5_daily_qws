// Last updated: 10/17/2025, 8:05:32 PM
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
