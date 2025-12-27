// Last updated: 27/12/2025, 16:01:34
1class Solution {
2    public int wiggleMaxLength(int[] nums) {
3        if (nums.length < 2) return nums.length;
4
5        int up = 1, down = 1;
6
7        for (int i = 1; i < nums.length; i++) {
8            if (nums[i] > nums[i - 1]) {
9                up = down + 1;
10            } else if (nums[i] < nums[i - 1]) {
11                down = up + 1;
12            }
13        }
14        return Math.max(up, down);
15    }
16}
17