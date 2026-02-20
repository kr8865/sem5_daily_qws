// Last updated: 20/02/2026, 12:06:36
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        int totalSum = 0;
4        for (int num : nums) totalSum += num;
5
6        // Mathematical impossibility checks
7        if (Math.abs(target) > totalSum || (totalSum + target) % 2 != 0) return 0;
8
9        int sum = (totalSum + target) / 2;
10        int n = nums.length;
11
12        int[][] dp = new int[n + 1][sum + 1];
13
14        // Base case: 1 way to form sum 0
15        for (int i = 0; i <= n; i++) dp[i][0] = 1;
16        
17        for (int i = 1; i <= n; i++) {
18            // Start j from 0 to handle cases where nums[i] might be 0
19            for (int j = 0; j <= sum; j++) {
20                if (nums[i - 1] <= j) {
21                    dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
22                } else {
23                    dp[i][j] = dp[i - 1][j];
24                }
25            }
26        }
27
28        return dp[n][sum];
29    }
30}