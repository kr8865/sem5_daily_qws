// Last updated: 10/17/2025, 8:04:29 PM
class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount+1][coins.length];
         for(int[] i: dp){
             Arrays.fill(i,-1);
         }
        return coin_exc(coins,amount,0,dp);
        
    }
    public static int coin_exc(int[] coin, int amount,int i,int[][] dp){
        if(amount==0){
            return 1;
        }
        if(i==coin.length){
            return 0;
        }
        int inc=0;
        int exc=0;
        if(dp[amount][i]!=-1){
            return dp[amount][i];
        }
        if(amount>=coin[i]){
            inc=coin_exc(coin,amount-coin[i],i,dp);
        }
        exc=coin_exc(coin,amount,i+1,dp);
        return dp[amount][i]=inc+exc;
    }
}