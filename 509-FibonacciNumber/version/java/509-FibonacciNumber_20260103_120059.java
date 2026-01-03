// Last updated: 03/01/2026, 12:00:59
1class Solution {
2    int[] dp;
3
4    public int fib(int n) {
5        dp = new int[n + 1];
6        Arrays.fill(dp, -1);
7        return fi(n);
8    }
9
10    public int fi(int n) {
11        if (n == 0) return 0;
12        if (n == 1) return 1;
13
14        if (dp[n] != -1) {
15            return dp[n];
16        }
17
18        dp[n] = fi(n - 1) + fi(n - 2);
19        return dp[n];
20    }
21}
22