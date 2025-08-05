// Last updated: 8/5/2025, 7:31:02 PM
// right_view
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
       
        view(root,1,ll);
        return ll;
        
    }
    private int maxd=0;
    public void view(TreeNode root,int cl,List<Integer> ll){
        if(root==null){
            return;
        }
        if(maxd<cl){
            ll.add(root.val);

            maxd=cl;
            
        }
        view(root.right,cl+1,ll);
        view(root.left,cl+1,ll);
        
    }
}