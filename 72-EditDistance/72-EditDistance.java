// Last updated: 10/17/2025, 8:07:18 PM
class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=i;
          
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    int a=dp[i][j-1];
                    int b=dp[i-1][j];
                    int c=dp[i-1][j-1];
                    dp[i][j]=Math.min(a,Math.min(b,c))+1;
                }



            }
        }
        return dp[n][m];
        
    }
}