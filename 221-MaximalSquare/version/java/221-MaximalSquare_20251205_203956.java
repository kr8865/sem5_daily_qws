// Last updated: 05/12/2025, 20:39:56
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3        int n = matrix.length;
4        int m = matrix[0].length;
5        int[][] dp = new int[n][m];
6        int max = 0;
7        
8        // fill first row and column
9        for(int i = 0; i < n; i++){
10            dp[i][0] = matrix[i][0] - '0';
11            max = Math.max(max, dp[i][0]);
12        }
13        for(int j = 0; j < m; j++){
14            dp[0][j] = matrix[0][j] - '0';
15            max = Math.max(max, dp[0][j]);
16        }
17
18        // main dp
19        for(int i = 1; i < n; i++){
20            for(int j = 1; j < m; j++){
21                if(matrix[i][j] == '1'){
22                    dp[i][j] = 1 + Math.min(dp[i-1][j], 
23                                   Math.min(dp[i][j-1], dp[i-1][j-1]));
24                    max = Math.max(max, dp[i][j]);
25                }
26            }
27        }
28
29        return max * max; // maximal square area
30    }
31}
32