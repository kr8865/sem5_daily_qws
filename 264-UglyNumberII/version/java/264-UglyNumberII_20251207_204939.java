// Last updated: 07/12/2025, 20:49:39
1class Solution {
2    public int nthUglyNumber(int n) {
3        int[] dp=new int[n+1];
4        dp[1]=1;
5        int id2=1;
6        int id3=1;
7        int id5=1;
8        
9        for(int i=2;i<=n;i++){
10            int i2=dp[id2]*2;
11            int i3=dp[id3]*3;
12            int i5=dp[id5]*5;
13            int v=Math.min(i2,Math.min(i3,i5));
14            dp[i]=v;
15            if(v==i2){
16                id2++;
17            }
18            if(v==i3){
19                id3++;
20            }
21            if(v==i5){
22                id5++;
23            }
24
25
26        }
27        return dp[n];
28        
29    }
30}