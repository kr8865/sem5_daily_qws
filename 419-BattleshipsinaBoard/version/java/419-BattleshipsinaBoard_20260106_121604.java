// Last updated: 06/01/2026, 12:16:04
1class Solution {
2    public int countBattleships(char[][] board) {
3        int c=0;
4       for(int i=0;i<board.length;i++){
5        for(int j=0;j<board[0].length;j++){
6            if(board[i][j]=='X'){
7                dfs(i,j,board);
8                c++;
9            }
10       }
11    }
12        return c;
13       
14    }
15    int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
16    public  void dfs(int i,int j,char[][] board){
17        board[i][j]='.';
18        for(int[] dir:directions){
19            int nx=i+dir[0];
20            int ny=j+dir[1];
21            if(nx>=0 && ny>=0 && nx<board.length && ny<board[0].length && board[nx][ny]=='X'){
22                dfs(nx,ny,board);
23            }
24        }
25
26    }
27}