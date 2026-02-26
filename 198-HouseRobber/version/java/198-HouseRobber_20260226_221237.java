// Last updated: 26/02/2026, 22:12:37
1class Solution {
2    public int rob(int[] nums) {
3        int[] dp=new int[nums.length];
4        if(nums.length==1){
5            return nums[0];
6        }
7        dp[0]=nums[0];
8        dp[1]=Math.max(nums[0],nums[1]);
9        for(int i=2;i<nums.length;i++){
10            int pick=nums[i]+dp[i-2];
11
12            int notpick=dp[i-1];
13            dp[i]=Math.max(pick,notpick);
14        }
15        return dp[nums.length-1];        
16        
17    }
18}