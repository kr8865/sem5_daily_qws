// Last updated: 10/17/2025, 8:06:43 PM
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
    public void flatten(TreeNode root) {
        if (root == null) return; // ✅ prevent NPE

        ArrayList<Integer> ll = new ArrayList<>();
        pre(root, ll);

        TreeNode rot = build(ll, 0); // flattened tree

        if (rot != null) { // ✅ check before accessing
            root.val = rot.val;
            root.left = null;
            root.right = rot.right;
        }
        

        
    }
    public static List<Integer> pre(TreeNode root,List<Integer> ll){
        if(root==null){
            return ll;
        }
        ll.add(root.val);
        pre(root.left,ll);
        pre(root.right,ll);
        return ll;
      


    }
    
    public static TreeNode build(ArrayList<Integer> ll,int idx){
        if(idx>=ll.size()){
            return null;

        }
        
        TreeNode node=new TreeNode(ll.get(idx));
       
        node.left=null;
        node.right=build(ll,idx+1);
        return node;

    }
}