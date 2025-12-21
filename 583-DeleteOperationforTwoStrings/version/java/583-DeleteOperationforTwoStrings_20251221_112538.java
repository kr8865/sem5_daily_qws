// Last updated: 21/12/2025, 11:25:38
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int[][] dp=new int[word1.length()+1][word2.length()+1];
4        for(int i=0;i<dp.length;i++){
5            dp[i][0]=i;
6        }
7        for(int i=0;i<dp[0].length;i++){
8            dp[0][i]=i;
9        }
10        for(int i=1;i<dp.length;i++){
11            for(int j=1;j<dp[0].length;j++){
12                if(word1.charAt(i-1)==word2.charAt(j-1)){
13                    dp[i][j]=dp[i-1][j-1];
14                }
15                else{
16                    int in=dp[i-1][j];
17                    int ex=dp[i][j-1];
18                    dp[i][j]=Math.min(in,ex)+1;
19                }
20            }
21        }
22        return dp[word1.length()][word2.length()];
23        
24    }
25}