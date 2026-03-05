// Last updated: 05/03/2026, 10:00:10
1class Solution {
2    public int maxProfit(int[] prices) {
3        int[][] dp=new int[prices.length][2];
4        for(int i=0;i<prices.length;i++){
5            Arrays.fill(dp[i],Integer.MIN_VALUE);
6        }
7        int val=fn(prices,0,1,dp);
8        return val;
9        
10
11    }
12    public static int fn(int[] prices,int idx,int buy,int[][] dp){
13        if(idx>=prices.length){
14            return 0;
15        }
16        if(dp[idx][buy]!=Integer.MIN_VALUE){
17            return dp[idx][buy];
18        }
19
20
21        if(buy==1){
22            int b=-prices[idx]+fn(prices,idx+1,0,dp);
23            int skip=fn(prices,idx+1,buy,dp);
24
25            return dp[idx][buy]= Math.max(b,skip);
26        }
27        else{
28            int sell=prices[idx]+fn(prices,idx+1,1,dp);
29            int skip=fn(prices,idx+1,buy,dp);
30            return dp[idx][buy]= Math.max(sell,skip);
31        }
32    }
33}