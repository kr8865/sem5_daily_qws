// Last updated: 10/17/2025, 8:05:19 PM
class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return recur(n,dp);
    }

    public static int recur(int n,int[] dp) {
        if (n == 0) return 0; // base case: 0 needs 0 squares
        int minCount = Integer.MAX_VALUE;

        // try all perfect squares <= n
        if(dp[n]!=-1){
            return dp[n];
        }
        for (int i = 1; i * i <= n; i++) {
            minCount = Math.min(minCount, 1 + recur(n - i * i,dp));
            dp[n]=minCount;
        }

        return dp[n];
    }
}
