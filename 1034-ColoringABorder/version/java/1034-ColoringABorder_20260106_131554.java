// Last updated: 06/01/2026, 13:15:54
1class Solution {  
2    public int[][] colorBorder(int[][] grid, int row, int col, int color) {  
3        boolean[][] visited = new boolean[grid.length][grid[0].length];    
4        dfs(grid, row, col, grid[row][col], visited);  
5          
6        for (int i = 0; i < grid.length; i++) {  
7            for (int j = 0; j < grid[0].length; j++) {  
8                if (grid[i][j] < 0) {  
9                    grid[i][j] = color;  
10                }  
11            }  
12        }  
13          
14        return grid;  
15    }  
16  
17    void dfs(int[][] grid, int row, int col, int clr, boolean[][] visited) {  
18        visited[row][col] = true;  
19        int count = 0;  
20        int[][] dirs = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} };  
21  
22        for (int[] dir : dirs) {  
23            int newRow = row + dir[0];  
24            int newCol = col + dir[1];  
25  
26            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && Math.abs(grid[newRow][newCol]) == clr) {  
27                count++;  
28                if (!visited[newRow][newCol]) {  
29                    dfs(grid, newRow, newCol, clr, visited);  
30                }  
31            }  
32        }  
33  
34        // If the cell is not a border cell, restore its original color  
35        if (count == 4) {  
36            grid[row][col] = clr;  
37        } else {  
38            grid[row][col] = -clr; // Mark this cell to be colored later  
39        }  
40    }  
41}