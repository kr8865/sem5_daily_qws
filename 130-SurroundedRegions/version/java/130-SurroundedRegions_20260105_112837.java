// Last updated: 05/01/2026, 11:28:37
1class Solution {
2    public void solve(char[][] board) {
3        int n=board.length;
4        int m=board[0].length;
5        boolean[][] vis=new boolean[n][m];
6        for(int i = 0; i < n; i++){
7            if(board[i][0] == 'O' && !vis[i][0]){
8                dfs(board, i, 0, vis);
9            }
10            if(board[i][m-1] == 'O' && !vis[i][m-1]){
11                dfs(board, i, m-1, vis);
12            }
13        }
14
15        // first & last row
16        for(int j = 0; j < m; j++){
17            if(board[0][j] == 'O' && !vis[0][j]){
18                dfs(board, 0, j, vis);
19            }
20            if(board[n-1][j] == 'O' && !vis[n-1][j]){
21                dfs(board, n-1, j, vis);
22            }
23        }for(int i=0;i<n;i++){
24            for(int j=0;j<m;j++){
25                if(board[i][j]=='O' && !vis[i][j]){
26                    board[i][j]='X';
27
28                }
29            }
30        }
31       
32
33    }
34    static int[][] directions={{1,0},{0,1},{-1,0},{0,-1}};
35    public static void dfs(char[][] board,int i,int j,boolean[][] vis){
36        vis[i][j]=true;
37
38
39        for(int[] dir:directions){
40            int ni=i+dir[0];
41            int nj=j+dir[1];
42            if(ni>=0 && nj>=0 && ni<board.length && nj<board[0].length && board[ni][nj]=='O' && !vis[ni][nj] ){
43                dfs(board,ni,nj,vis);
44            }
45            
46        }
47    }
48}