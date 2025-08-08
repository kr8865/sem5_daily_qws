// Last updated: 8/8/2025, 11:00:29 AM
// sroted_bst
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildtree(0,nums.length-1,nums);
    }
    public static TreeNode buildtree(int si,int ei,int[] nums){
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        int val=nums[mid];

        TreeNode node=new TreeNode(val);
        node.left=buildtree(si,mid-1,nums);
        node.right=buildtree(mid+1,ei,nums);

        return node;
    }
}