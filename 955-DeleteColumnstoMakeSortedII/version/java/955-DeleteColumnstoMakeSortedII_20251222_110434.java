// Last updated: 22/12/2025, 11:04:34
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int n = strs.length;
4        int m = strs[0].length();
5        boolean[] sorted = new boolean[n - 1];
6        int deletions = 0;
7
8        for (int col = 0; col < m; col++) {
9            boolean delete = false;
10
11            for (int row = 0; row < n - 1; row++) {
12                if (!sorted[row] && strs[row].charAt(col) > strs[row + 1].charAt(col)) {
13                    delete = true;
14                    break;
15                }
16            }
17
18            if (delete) {
19                deletions++;
20                continue;
21            }
22
23            for (int row = 0; row < n - 1; row++) {
24                if (strs[row].charAt(col) < strs[row + 1].charAt(col)) {
25                    sorted[row] = true;
26                }
27            }
28        }
29        return deletions;
30    }
31}
32