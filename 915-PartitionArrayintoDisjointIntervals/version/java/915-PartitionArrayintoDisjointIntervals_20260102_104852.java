// Last updated: 02/01/2026, 10:48:52
1class Solution {
2    public int partitionDisjoint(int[] nums) {
3        int leftMax = nums[0];
4        int currMax = nums[0];
5        int ans = 0;
6
7        for (int i = 1; i < nums.length; i++) {
8            currMax = Math.max(currMax, nums[i]);
9
10            if (nums[i] < leftMax) {
11                leftMax = currMax;
12                ans = i;
13            }
14        }
15        return ans + 1;
16    }
17}
18