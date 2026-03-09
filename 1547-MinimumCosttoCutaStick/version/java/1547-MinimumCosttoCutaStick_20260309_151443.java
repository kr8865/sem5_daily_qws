// Last updated: 09/03/2026, 15:14:43
1class Solution {
2    int[][] dp;
3    
4    int solve(int start_stick, int end_stick, int[] cuts, int left, int right) {
5        if (left > right) return 0;
6
7        if (dp[left][right] != -1) return dp[left][right];
8
9        int cost = Integer.MAX_VALUE;
10
11        for (int i = left; i <= right; i++) {
12            int left_cost = solve(start_stick, cuts[i], cuts, left, i - 1);
13            int right_cost = solve(cuts[i], end_stick, cuts, i + 1, right);
14            int curr_cost = (end_stick - start_stick) + left_cost + right_cost;
15            cost = Math.min(cost, curr_cost);
16        }
17
18        return dp[left][right] = cost;
19    }
20    
21    int minCost(int n, int[] cuts) {
22        dp = new int[cuts.length][cuts.length];
23        for (int[] row : dp) {
24            Arrays.fill(row, -1);
25        }
26        
27        Arrays.sort(cuts);
28        return solve(0, n, cuts, 0, cuts.length - 1);
29    }
30}