// Last updated: 03/01/2026, 12:47:17
1class Solution {
2    public String longestPalindrome(String s) {
3        int n=s.length();
4        boolean[][] dp=new boolean[n][n];
5        for(int i=n-1;i>=0;i--){
6            for(int j=i;j<n;j++){
7                String sub=s.substring(i,j+1);
8                if(sub.length()==1){
9                    dp[i][j]=true;
10                }
11                else if(sub.length()==2){
12                    dp[i][j]=(s.charAt(i)==s.charAt(j));
13
14                }
15                else{
16                    dp[i][j]=(s.charAt(i)==s.charAt(j))&& dp[i+1][j-1];
17                }
18            }
19        }
20        int maxi=-1;
21        int maxj=-1;
22        int maxlen=-1;
23        for(int i=0;i<n;i++){
24            for(int j=0;j<n;j++){
25                if( dp[i][j]){
26                    int len=j-i+1;
27                    if(maxlen<len){
28                        maxi=i;
29                        maxj=j;
30                        maxlen=len;
31                    }
32
33                }
34            }
35        }
36        return s.substring(maxi,maxj+1);
37    }
38}