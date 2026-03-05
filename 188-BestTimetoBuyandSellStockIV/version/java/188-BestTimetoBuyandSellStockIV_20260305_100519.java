// Last updated: 05/03/2026, 10:05:19
1class Solution {
2    int[][][] dp;
3
4    public int maxProfit(int k, int[] prices) {
5        int n = prices.length;
6        dp = new int[n][k + 1][2];
7
8        // Initialize DP array with -1 (uncomputed)
9        for (int i = 0; i < n; i++) {
10            for (int j = 0; j <= k; j++) {
11                dp[i][j][0] = -1;
12                dp[i][j][1] = -1;
13            }
14        }
15
16        return solve(0, k, prices, 1);
17    }
18
19    int solve(int i, int k, int[] prices, int canBuy) {
20        if (k <= 0 || i >= prices.length) return 0;
21
22        if (dp[i][k][canBuy] != -1) return dp[i][k][canBuy];
23
24        if (canBuy == 1) {
25            // Option 1: Buy the stock
26            int buy = -prices[i] + solve(i + 1, k, prices, 0);
27            // Option 2: Skip
28            int notBuy = solve(i + 1, k, prices, 1);
29            return dp[i][k][canBuy] = Math.max(buy, notBuy);
30        } else {
31            // Option 1: Sell the stock (uses 1 transaction)
32            int sell = prices[i] + solve(i + 1, k - 1, prices, 1);
33            // Option 2: Hold
34            int hold = solve(i + 1, k, prices, 0);
35            return dp[i][k][canBuy] = Math.max(sell, hold);
36        }
37    }
38}