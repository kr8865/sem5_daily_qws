// Last updated: 03/12/2025, 13:00:56
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
17    public int sumNumbers(TreeNode root) {
18        return sum(root,0);
19        
20        
21    }
22    public static int sum(TreeNode root,int sum){
23        if(root==null){
24            return 0;
25        }
26        if(root.left==null && root.right==null){
27            return sum*10+root.val;
28        }
29        int ls=sum(root.left,sum*10+root.val);
30        int rs=sum(root.right,sum*10+root.val);
31        return ls+rs;
32    }
33}