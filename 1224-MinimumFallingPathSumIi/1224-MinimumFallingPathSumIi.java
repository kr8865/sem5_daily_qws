// Last updated: 9/24/2025, 10:11:56 PM
class Solution {
    public int minFallingPathSum(int[][] grid) {
        int ans=Integer.MAX_VALUE;
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] a:dp){
            Arrays.fill(a,-66666);
        }
        for(int col=0;col<grid[0].length;col++){
            ans=Math.min(ans,sum(grid,0,col,dp));
        }
        return ans;

        
    }
    
    public static int sum(int[][] matrix,int cr,int cc,int[][] dp){
        if(cr==matrix.length-1){
            return matrix[cr][cc];

        }
        if(dp[cr][cc]!=-66666){
            return dp[cr][cc];
        }
        int an=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            if(i==cc){
                continue;
            }
            an=Math.min(an,sum(matrix, cr+1, i, dp));
        }

        return dp[cr][cc]= an+matrix[cr][cc];

    
        
    }
    
        
    
}