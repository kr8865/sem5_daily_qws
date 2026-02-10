// Last updated: 10/02/2026, 14:48:58
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        int n = triangle.size();
4        int[][] dp = new int[n][n];
5
6        for (int i = 0; i < n; i++) {
7            Arrays.fill(dp[i], Integer.MAX_VALUE);
8        }
9
10        return total(triangle, 0, 0, dp);
11    }
12
13    public static int total(List<List<Integer>> triangle, int i, int j, int[][] dp) {
14
15        if (i == triangle.size() - 1) {
16            return triangle.get(i).get(j);
17        }
18
19        if (dp[i][j] != Integer.MAX_VALUE) {
20            return dp[i][j];
21        }
22
23        int down = total(triangle, i + 1, j, dp);
24        int diag = total(triangle, i + 1, j + 1, dp);
25
26        dp[i][j] = triangle.get(i).get(j) + Math.min(down, diag);
27        return dp[i][j];
28    }
29}
30