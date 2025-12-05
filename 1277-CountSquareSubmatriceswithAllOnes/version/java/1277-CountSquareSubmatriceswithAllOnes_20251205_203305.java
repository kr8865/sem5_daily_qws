// Last updated: 05/12/2025, 20:33:05
1class Solution {
2    public int countSquares(int[][] matrix) {
3        int[][] dp=new int[matrix.length][matrix[0].length];
4        for(int i=0;i<dp.length;i++){
5            dp[i][0]=matrix[i][0];
6        }
7        for(int i=0;i<dp[0].length;i++){
8            dp[0][i]=matrix[0][i];
9        }
10
11        for(int i=1;i<dp.length;i++){
12            for(int j=1;j<dp[0].length;j++){
13                if(matrix[i][j]==1){
14                    int s=dp[i][j-1];
15                    int f=dp[i-1][j];
16                    int t=dp[i-1][j-1];
17                    dp[i][j]=1+Math.min(s,Math.min(f,t));
18                }
19            }
20        }
21        int sum=0;
22        for(int i=0;i<dp.length;i++){
23            for(int j=0;j<dp[0].length;j++){
24                sum+=dp[i][j];
25            }
26        }
27        return sum;
28        
29    }
30}