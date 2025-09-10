// Last updated: 9/10/2025, 11:58:52 AM
class Solution {
    public int minPathSum(int[][] grid) {
        int cr = 0;
        int cc = 0;
        int[][] dp = new int[grid.length][grid[0].length];

        // initialize dp with -1
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        return Minimum_path(grid, cr, cc, dp);
    }

    public static int Minimum_path(int[][] grid, int cr, int cc, int[][] dp) {
        // base case: reached bottom-right
        if (cr == grid.length - 1 && cc == grid[0].length - 1) {
            return grid[cr][cc];
        }

        // out of bounds
        if (cc == grid[0].length || cr == grid.length) {
            return Integer.MAX_VALUE;
        }

        // already computed
        if (dp[cr][cc] != -1) {
            return dp[cr][cc];
        }

        int d = Minimum_path(grid, cr + 1, cc, dp);   // move down
        int r = Minimum_path(grid, cr, cc + 1, dp);   // move right

        dp[cr][cc] = Math.min(d, r) + grid[cr][cc];   // store result
        return dp[cr][cc];
    }
}
