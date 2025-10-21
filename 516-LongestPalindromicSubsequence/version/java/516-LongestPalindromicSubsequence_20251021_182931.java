// Last updated: 10/21/2025, 6:29:31 PM
class Solution {
    public int longestPalindromeSubseq(String s) {
        String s1 = new StringBuilder(s).reverse().toString();
        int[][] dp=new int[s.length()+1][s.length()+1];
        for(int i=0;i<=s.length();i++){
            dp[i][0]=0;
            dp[0][i]=0;

        }
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=s.length();j++){
                if(s.charAt(i-1)==s1.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    int m=dp[i][j-1];
                    int n=dp[i-1][j];
                    dp[i][j]=Math.max(m,n);
                }
            }
        }
        return dp[s.length()][s.length()];

    }
}