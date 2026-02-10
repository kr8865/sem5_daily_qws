// Last updated: 10/02/2026, 16:05:28
1class Solution {
2
3    static class Pair {
4        TreeNode node;
5        int lvl;
6
7        Pair(TreeNode node, int lvl) {
8            this.node = node;
9            this.lvl = lvl;
10        }
11    }
12
13    public TreeNode reverseOddLevels(TreeNode root) {
14        if (root == null) return null;
15
16        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
17        Queue<Pair> q = new LinkedList<>();
18
19        q.add(new Pair(root, 0));
20
21        while (!q.isEmpty()) {
22            int size = q.size();
23            ArrayList<Integer> ll = new ArrayList<>();
24            boolean odd = false;
25
26            for (int i = 0; i < size; i++) {
27                Pair p = q.poll();
28                TreeNode v = p.node;
29
30                if (p.lvl % 2 != 0) odd = true;
31
32                ll.add(v.val);
33
34                if (v.left != null)
35                    q.add(new Pair(v.left, p.lvl + 1));
36                if (v.right != null)
37                    q.add(new Pair(v.right, p.lvl + 1));
38            }
39
40            if (odd) Collections.reverse(ll);
41            l.add(ll);
42        }
43
44        return makeTree(l);
45    }
46
47    public static TreeNode makeTree(ArrayList<ArrayList<Integer>> l) {
48        if (l.size() == 0) return null;
49
50        TreeNode root = new TreeNode(l.get(0).get(0));
51        Queue<TreeNode> q = new LinkedList<>();
52        q.add(root);
53
54        int level = 1;
55
56        while (!q.isEmpty() && level < l.size()) {
57            int size = q.size();
58            int idx = 0;
59
60            for (int i = 0; i < size; i++) {
61                TreeNode curr = q.poll();
62
63                if (idx < l.get(level).size()) {
64                    curr.left = new TreeNode(l.get(level).get(idx++));
65                    q.add(curr.left);
66                }
67
68                if (idx < l.get(level).size()) {
69                    curr.right = new TreeNode(l.get(level).get(idx++));
70                    q.add(curr.right);
71                }
72            }
73            level++;
74        }
75
76        return root;
77    }
78}
79