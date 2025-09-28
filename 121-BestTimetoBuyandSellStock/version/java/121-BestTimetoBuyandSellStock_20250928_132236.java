// Last updated: 9/28/2025, 1:22:36 PM
class Solution {
    public int maxProfit(int[] prices) {
        int khareed = Integer.MAX_VALUE; // min price so far
        int maxProfit = 0;

        for (int price : prices) {
            // update minimum price
            if (price < khareed) {
                khareed = price;
            } else {
                // update maximum profit
                maxProfit = Math.max(maxProfit, price - khareed);
            }
        }

        return maxProfit;
    }
}