// Last updated: 12/01/2026, 20:50:07
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int n = s.length();
4        int m = p.length();
5
6        boolean[][] dp = new boolean[n + 1][m + 1];
7        dp[0][0] = true; // empty string matches empty pattern
8
9        // handle patterns like "*", "**", "***" at the start
10        for (int j = 1; j <= m; j++) {
11            if (p.charAt(j - 1) == '*') {
12                dp[0][j] = dp[0][j - 1];
13            }
14        }
15
16        // fill DP table
17        for (int i = 1; i <= n; i++) {
18            for (int j = 1; j <= m; j++) {
19                char sc = s.charAt(i - 1);
20                char pc = p.charAt(j - 1);
21
22                if (pc == sc || pc == '?') {
23                    dp[i][j] = dp[i - 1][j - 1];
24                } else if (pc == '*') {
25                    // '*' can match empty or any sequence of chars
26                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
27                } else {
28                    dp[i][j] = false;
29                }
30            }
31        }
32
33        return dp[n][m];
34    }
35}