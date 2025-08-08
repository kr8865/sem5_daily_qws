// Last updated: 8/8/2025, 3:01:40 PM
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
    public int findSecondMinimumValue(TreeNode root) {
        int firstMin = findMin(root);
        long secondMin = findSecondMin(root, firstMin); // long so we can store > Integer.MAX_VALUE
        
        return (secondMin == Long.MAX_VALUE) ? -1 : (int) secondMin;
    }
    
    public static int findMin(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;
        int lm = findMin(root.left);
        int rm = findMin(root.right);
        return Math.min(Math.min(lm, rm), root.val);
    }
    
    public static long findSecondMin(TreeNode root, int minVal){
        if(root == null) return Long.MAX_VALUE;
        
        if(root.val == minVal){
            long lm = findSecondMin(root.left, minVal);
            long rm = findSecondMin(root.right, minVal);
            return Math.min(lm, rm);
        } else {
            long lm = findSecondMin(root.left, minVal);
            long rm = findSecondMin(root.right, minVal);
            return Math.min(Math.min(lm, rm), root.val);
        }
    }
}
