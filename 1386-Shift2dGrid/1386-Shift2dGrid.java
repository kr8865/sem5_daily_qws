// Last updated: 10/17/2025, 8:02:36 PM
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ll = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                int idx = ((i*n)+j+k) % (m*n);
                int row = idx/n;
                int col = idx%n;
                ans[row][col] = grid[i][j];
            }
        }
        for(int i = 0; i<m; i++){
            List<Integer> l = new ArrayList<>();
            for(int j = 0; j<n; j++){
                l.add(ans[i][j]);
            }
            ll.add(l);
        }
        return ll;
    }
}