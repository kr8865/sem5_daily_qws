// Last updated: 7/31/2025, 2:04:17 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    c++;
                }
            }
        }
        return c;
    }
}