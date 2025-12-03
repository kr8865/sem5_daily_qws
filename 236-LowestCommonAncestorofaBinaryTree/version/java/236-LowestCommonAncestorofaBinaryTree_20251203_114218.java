// Last updated: 03/12/2025, 11:42:18
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12        if(root==null){
13            return null;
14        }
15        TreeNode left=lowestCommonAncestor(root.left,p,q);
16        TreeNode right=lowestCommonAncestor(root.right,p,q);
17        if(root==p || root==q){
18            return root;
19        }
20        if(left==null){
21            return right;
22        }
23        if(right==null){
24            return left;
25        }
26        if(right!=null && left!=null){
27            return root;
28        }
29        return root;
30        
31        
32    }
33}