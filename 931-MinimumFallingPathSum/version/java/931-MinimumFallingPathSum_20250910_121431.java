// Last updated: 9/10/2025, 12:14:31 PM
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];

        // Initialize the last row of dp with matrix values (base case)
        for (int j = 0; j < n; j++) {
            dp[n-1][j] = matrix[n-1][j];
        }

        // Build the dp table from bottom to top
        for (int i = n-2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int down = dp[i+1][j]; // directly below
                int leftDiagonal = (j > 0) ? dp[i+1][j-1] : Integer.MAX_VALUE;
                int rightDiagonal = (j < n-1) ? dp[i+1][j+1] : Integer.MAX_VALUE;

                dp[i][j] = matrix[i][j] + Math.min(down, Math.min(leftDiagonal, rightDiagonal));
            }
        }

        // The answer is the minimum in the first row
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, dp[0][j]);
        }
        return ans;
    }
}
