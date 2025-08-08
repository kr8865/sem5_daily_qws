// Last updated: 8/8/2025, 4:24:07 PM
// inc_order_st
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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> ll=new ArrayList<>();
        inorder(root,ll);
        TreeNode rooot=buildtree(ll,0);
        return rooot;
        
    }
    public static void inorder(TreeNode root,ArrayList<Integer> ll){
        if(root==null){
            return;
        }
        inorder(root.left,ll);
        ll.add(root.val);
        inorder(root.right,ll);
    }
    
    public static TreeNode buildtree(ArrayList<Integer> ll,int i){
        if(i>=ll.size()){
            return null;
        }
        TreeNode node=new TreeNode(ll.get(i));
        node.right=buildtree(ll,i+1);
        return node;
        
    }
}