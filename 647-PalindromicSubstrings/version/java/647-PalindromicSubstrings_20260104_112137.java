// Last updated: 04/01/2026, 11:21:37
1class Solution {
2    public int countSubstrings(String s) {
3        int n = s.length();
4
5        boolean[][] dp = new boolean[n][n];
6
7        for (int i = n - 1; i >= 0; i--) {     
8            for (int j = i; j < n; j++) {
9                String sub = s.substring(i, j + 1);
10
11                if (sub.length() == 1) {
12                    dp[i][j] = true;
13                }
14                else if (sub.length() == 2) {
15                    dp[i][j] = (s.charAt(i) == s.charAt(j));
16                }
17                else {
18                    dp[i][j] = (s.charAt(i) == s.charAt(j))  
19                               && dp[i + 1][j - 1];
20                }
21            }
22        }
23
24        int ans = 0;
25        for (int i = 0; i < n; i++) {
26            for (int j = 0; j < n; j++) {
27                if (dp[i][j]) ans++;
28            }
29        }
30        return ans;
31    }
32}
33