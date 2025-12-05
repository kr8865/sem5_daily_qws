// Last updated: 05/12/2025, 20:22:00
1class Solution {
2    public int countSquares(int[][] matrix) {
3        int c=0;
4        int[][] dp=new int[matrix.length][matrix[0].length];
5        for(int[] row:dp){
6            Arrays.fill(row,-1);
7        }
8        for(int i=0;i<matrix.length;i++){
9            for(int j=0;j<matrix[0].length;j++){
10                if(matrix[i][j]==1){
11                    c+=solve(matrix,i,j,dp);
12                }
13            }
14        }
15        return c;
16    }
17    public static int solve(int[][] matrix,int i,int j,int[][] dp){
18        if(i>=matrix.length || j>=matrix[0].length){
19            return 0;
20        }
21        if(matrix[i][j]==0){
22            return 0;
23        }
24        if(dp[i][j]!=-1){
25            return dp[i][j];
26        }
27        int s=solve(matrix,i+1,j,dp);
28        int f=solve(matrix,i,j+1,dp);
29        int t=solve(matrix,i+1,j+1,dp);
30        return dp[i][j]= 1+Math.min(t,Math.min(f,s));
31        
32    }
33}