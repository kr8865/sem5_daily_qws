// Last updated: 03/01/2026, 15:27:18
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] ans=new int[nums.length*2];
4        int k=0;
5        int n=nums.length;
6        for(int i=0;i<nums.length*2;i++){
7            ans[k]=nums[i%n];
8            k++;
9        }
10        
11        return ans;
12    }
13}