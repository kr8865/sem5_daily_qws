// Last updated: 03/01/2026, 13:21:06
1class Solution {
2    public int[] countBits(int n) {
3        if(n==0){
4            int[] arr=new int[1];
5            arr[0]=0;
6            return arr;
7        }
8        int[] dp=new int[n+1];
9        dp[0]=0;
10        dp[1]=1;
11        int po=1;
12        for(int i=2;i<=n;i++){
13            if(i==(int)Math.pow(2,po)){
14                dp[i]=1;
15                po++;
16            }
17            else{
18                int v=(int)Math.pow(2,po-1);
19                dp[i]=dp[v]+dp[i-v];
20            }
21
22        }
23        return dp;
24    }
25}