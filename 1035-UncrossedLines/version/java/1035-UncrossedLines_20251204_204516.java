// Last updated: 04/12/2025, 20:45:16
1class Solution {
2    public int maxUncrossedLines(int[] nums1, int[] nums2) {
3        int[][] dp=new int[nums1.length+1][nums2.length+1];
4        for(int i=0;i<dp.length;i++){
5            dp[i][0]=0;
6
7        }
8        for(int i=0;i<dp[0].length;i++){
9            dp[0][i]=0;
10        }
11        for(int i=1;i<dp.length;i++){
12            for(int j=1;j<dp[0].length;j++){
13                if(nums1[i-1]==nums2[j-1]){
14                    dp[i][j]=dp[i-1][j-1]+1;
15                }
16                else{
17                    int v=dp[i][j-1];
18                    int f=dp[i-1][j];
19                    dp[i][j]=Math.max(v,f);
20                }
21            }
22        }
23        return dp[nums1.length][nums2.length];        
24    }
25}