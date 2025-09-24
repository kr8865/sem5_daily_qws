// Last updated: 9/24/2025, 10:12:38 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        int zeroth = climbing(cost,0,dp);
        int first = climbing(cost,1,dp);
        return Math.min(zeroth,first);
    }
    public int climbing(int[] arr, int i, int[] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int f = climbing(arr, i+1,dp);
        int s = climbing(arr, i+2,dp);
        return dp[i] = Math.min(f,s)+arr[i];
    }
}