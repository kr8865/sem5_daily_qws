// Last updated: 03/12/2025, 11:31:39
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int diameterOfBinaryTree(TreeNode root) {
18        if(root==null){
19            return 0;
20        }
21        int ld=diameterOfBinaryTree(root.left);
22        int rd=diameterOfBinaryTree(root.right);
23        int sd=ht(root.left)+ht(root.right);
24        return Math.max(sd,Math.max(ld,rd));
25        
26    }
27    public static int ht(TreeNode root){
28        if(root==null){
29            return 0;
30        }
31        int lh=ht(root.left);
32        int rh=ht(root.right);
33        return Math.max(lh,rh)+1;
34    }
35}