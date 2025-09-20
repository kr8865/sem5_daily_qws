// Last updated: 9/20/2025, 10:29:25 PM
class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return find(n,dp);
        
    }
    public static int find(int n,int[] dp){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=find(n-1,dp)+find(n-2,dp);
        return dp[n];
    }
}