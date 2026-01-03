// Last updated: 03/01/2026, 15:31:16
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int ans[]=new int[n*2];
4        int k=0;
5        for(int i=0;i<n;i++){
6            
7            ans[k++]=nums[i];
8            
9            ans[k++]=nums[i+n];
10            
11        }
12        return ans;
13    }
14}