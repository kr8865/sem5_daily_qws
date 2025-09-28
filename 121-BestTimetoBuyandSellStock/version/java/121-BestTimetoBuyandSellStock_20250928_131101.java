// Last updated: 9/28/2025, 1:11:01 PM
class Solution {
    public int maxProfit(int[] prices) {
        int khareed=Integer.MAX_VALUE;
        int max=0;
        int bechdia=-1;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<khareed){
                khareed=prices[i];
                bechdia=-1;
            }
            else if(prices[i]>bechdia) {
                bechdia=prices[i];
                max=Math.max(max,(bechdia-khareed));

            }
            
        }
        
        return max;
        
    }
}