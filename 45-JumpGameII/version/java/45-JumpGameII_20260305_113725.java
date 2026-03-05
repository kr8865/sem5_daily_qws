// Last updated: 05/03/2026, 11:37:25
1class Solution {
2
3    public int jump(int[] nums) {
4
5        int[] dp = new int[nums.length];
6
7        Arrays.fill(dp, -1);
8
9        return fn(0, nums, dp);
10    }
11
12    public int fn(int idx, int[] nums, int[] dp) {
13
14        if (idx >= nums.length - 1) {
15            return 0;
16        }
17
18        if (dp[idx] != -1) {
19            return dp[idx];
20        }
21
22        int ans = Integer.MAX_VALUE;
23
24        for (int i = idx + 1; i <= Math.min(nums.length - 1, idx + nums[idx]); i++) {
25
26            int val = fn(i, nums, dp);
27
28            if (val != Integer.MAX_VALUE) {
29                ans = Math.min(ans, 1 + val);
30            }
31        }
32
33        return dp[idx] = ans;
34    }
35}