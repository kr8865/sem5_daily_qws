// Last updated: 28/02/2026, 14:33:51
1import java.util.*;
2
3class Solution {
4    public int coinChange(int[] coins, int amount) {
5
6        int n = coins.length;
7        int INF = (int)1e9;
8
9        int[][] dp = new int[n][amount + 1];
10
11        // Initialize first column
12        for(int i = 0; i < n; i++){
13            dp[i][0] = 0;
14        }
15
16        // Initialize first row
17        for(int j = 1; j <= amount; j++){
18            if(j % coins[0] == 0){
19                dp[0][j] = j / coins[0];
20            } else {
21                dp[0][j] = INF;
22            }
23        }
24
25        for(int i = 1; i < n; i++){
26            for(int j = 1; j <= amount; j++){
27
28                int exclude = dp[i-1][j];
29
30                int include = INF;
31                if(j >= coins[i] && dp[i][j - coins[i]] != INF){
32                    include = 1 + dp[i][j - coins[i]];
33                }
34
35                dp[i][j] = Math.min(include, exclude);
36            }
37        }
38
39        int ans = dp[n-1][amount];
40        return ans == INF ? -1 : ans;
41    }
42}