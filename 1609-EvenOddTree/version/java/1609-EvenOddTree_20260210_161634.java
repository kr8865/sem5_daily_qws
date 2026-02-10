// Last updated: 10/02/2026, 16:16:34
1class Solution {
2
3    public boolean isEvenOddTree(TreeNode root) {
4        if (root == null) return false;
5
6        Queue<TreeNode> q = new LinkedList<>();
7        q.add(root);
8        int level = 0;
9
10        while (!q.isEmpty()) {
11            int size = q.size();
12            int prev = (level % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
13
14            for (int i = 0; i < size; i++) {
15                TreeNode node = q.poll();
16
17                // Even level: odd values, strictly increasing
18                if (level % 2 == 0) {
19                    if (node.val % 2 == 0 || node.val <= prev) {
20                        return false;
21                    }
22                }
23                // Odd level: even values, strictly decreasing
24                else {
25                    if (node.val % 2 != 0 || node.val >= prev) {
26                        return false;
27                    }
28                }
29
30                prev = node.val;
31
32                if (node.left != null) q.add(node.left);
33                if (node.right != null) q.add(node.right);
34            }
35
36            level++;
37        }
38
39        return true;
40    }
41}
42