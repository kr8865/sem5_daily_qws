// Last updated: 8/17/2025, 10:27:13 AM
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
    int ca=0;
    public int minCameraCover(TreeNode root) {
       int c= minc(root);
        if(c==-1){
            ca++;
        }
        
        return ca;
    }
    public int  minc(TreeNode root){
        if(root==null){
            return 0;
        }
    


        int left=minc(root.left);
        int right=minc(root.right);
        if(left==-1 || right==-1){//-1 requirement h 
            ca++;//camera set kra h root pr

            return 1;
        }
        if(left==1 || right==1){ //inme se koi ek k pss ya dono k pss camera h
            return 0; //iska mtlb mein cover hun 
        }
        else{
            return -1;
        }

    }
}