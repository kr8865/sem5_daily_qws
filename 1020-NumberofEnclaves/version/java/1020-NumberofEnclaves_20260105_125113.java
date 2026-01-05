// Last updated: 05/01/2026, 12:51:13
1class Solution {
2    public int numEnclaves(int[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        boolean[][] vis=new boolean[n][m];
6        for(int i=0;i<n;i++){
7            if(grid[i][0]==1 && vis[i][0]==false){
8                dfs(grid,i,0,vis);
9            }
10            if(grid[i][m-1]==1 && vis[i][m-1]==false){
11                dfs(grid,i,m-1,vis);
12            }
13        }
14        for(int i=0;i<m;i++){
15            if(grid[0][i]==1 && vis[0][i] ==false){
16                dfs(grid,0,i,vis);
17            }
18            if(grid[n-1][i]==1 && vis[n-1][i]==false){
19                dfs(grid,n-1,i,vis);
20            }
21        }
22        int c=0;
23        for(int i=0;i<n;i++){
24            for(int j=0;j<m;j++){
25                if(grid[i][j]==1 && vis[i][j]==false){
26                    c++;
27                }
28            }
29        }
30        return c;
31    }
32    static int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
33    public static void dfs(int[][] grid,int i,int j,boolean[][] vis){
34        vis[i][j]=true;
35        for(int[] dir:directions){
36            int x=i+dir[0];
37            int y=j+dir[1];
38            if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && vis[x][y]==false && grid[x][y]==1){
39                dfs(grid,x,y,vis);
40            }
41        }
42
43    }
44}