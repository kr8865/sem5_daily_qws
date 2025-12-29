// Last updated: 29/12/2025, 19:59:08
1class Solution {
2    public int subsetXORSum(int[] nums) {
3        
4        int or = 0;
5        for (int num : nums) {
6            or |= num;
7        }
8        return or * (1 << (nums.length - 1));
9    
10
11    }
12}