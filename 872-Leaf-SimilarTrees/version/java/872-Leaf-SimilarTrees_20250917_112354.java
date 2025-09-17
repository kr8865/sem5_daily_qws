// Last updated: 9/17/2025, 11:23:54 AM
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ll=new ArrayList<>();
        ArrayList<Integer> ll2=new ArrayList<>();
        leaf(root1,ll);
        leaf(root2,ll2);
        if(ll.size()!=ll2.size()){
            return false;
        }
        for(int i=0;i<ll.size();i++){
            if(!ll.get(i).equals(ll2.get(i))){
                return false;

            }        
        }
        return true;
        
    }
    public static void leaf(TreeNode root1,ArrayList<Integer> ll){
        if(root1==null){
            return;
        }
        if(root1.left==null && root1.right==null){
            ll.add(root1.val);
            return;
        }
        leaf(root1.left,ll);
        leaf(root1.right,ll);
    }
}