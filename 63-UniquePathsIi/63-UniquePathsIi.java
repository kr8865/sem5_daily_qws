// Last updated: 10/17/2025, 8:07:25 PM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];

        // First cell
        dp[0][0] = (obstacleGrid[0][0] == 0) ? 1 : 0;

        // First column
        for(int i = 1; i < row; i++){
            dp[i][0] = (obstacleGrid[i][0] == 0 && dp[i-1][0] != 0) ? 1 : 0;
        }

        // First row
        for(int j = 1; j < col; j++){
            dp[0][j] = (obstacleGrid[0][j] == 0 && dp[0][j-1] != 0) ? 1 : 0;
        }

        // Fill rest of the DP table
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                dp[i][j] = (obstacleGrid[i][j] == 1) ? 0 : dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[row-1][col-1];
    }
}
