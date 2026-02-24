// Last updated: 24/02/2026, 15:30:51
1class Solution {
2    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
3        boolean[][] connected = new boolean[n][n];
4        for (int[] p : prerequisites)
5            connected[p[0]][p[1]] = true; // p[0] -> p[1]
6        for (int k = 0; k < n; k++)
7            for (int i = 0; i < n; i++)
8                for (int j = 0; j < n; j++)
9                    connected[i][j] = connected[i][j] || connected[i][k] && connected[k][j];
10        List<Boolean> ans = new ArrayList<>();
11        for (int[] q : queries)
12            ans.add(connected[q[0]][q[1]]);
13        return ans;
14    }
15}