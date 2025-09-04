// Last updated: 9/4/2025, 11:18:35 AM
class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        return uncrossed(nums1,nums2);
    }

    public static int uncrossed(int[] s1, int[] s2){
        int[][] dp = new int[s1.length+1][s2.length+1];
        for(int i=1; i<=s1.length; i++){
            for(int j=1; j<=s2.length; j++){
                int ans = 0;

                if(s1[i-1]==s2[j-1]){
                    ans = 1 + dp[i-1][j-1];
                }
                else{
                    int f = dp[i-1][j];
                    int s = dp[i][j-1];
                    ans = Math.max(f,s);
                }

                dp[i][j]=ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}