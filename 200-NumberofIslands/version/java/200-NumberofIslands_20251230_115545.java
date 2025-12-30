// Last updated: 30/12/2025, 11:55:45
1class Solution {
2    public int numIslands(char[][] grid) {
3        int is=0;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid[0].length;j++){
6                if(grid[i][j]=='1'){
7                    check(i,j,grid);
8                    is++;
9                }
10            }
11        }
12        return is;
13    }
14    public static void check(int i ,int j, char[][] grid){
15        if(i>=grid.length || j>=grid[0].length|| i<0 || j<0){
16            return;
17
18        }
19         if (grid[i][j] == '0') {
20            return;
21        }
22        grid[i][j]='0';
23        check(i+1,j,grid);
24        check(i,j+1,grid);
25        check(i,j-1,grid);
26        check(i-1,j,grid);
27       
28
29    }
30}