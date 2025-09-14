// Last updated: 9/14/2025, 4:30:22 PM
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ll1=new ArrayList<>();
        ArrayList<Integer> ll2=new ArrayList<>();
        ArrayList<Integer> ll3=new ArrayList<>();
        pre(root1,ll1);
        pre(root2,ll2);
        for(int i=0;i<ll1.size();i++){
            ll3.add(ll1.get(i));

        }
        for(int i=0;i<ll2.size();i++){
            ll3.add(ll2.get(i));
        }
        Collections.sort(ll3);
        return ll3;

        

        
    }
    public static void pre(TreeNode root,ArrayList<Integer> ll){
        if(root==null){
            return;
        }
        pre(root.left,ll);
        ll.add(root.val);
        pre(root.right,ll);
    }
}