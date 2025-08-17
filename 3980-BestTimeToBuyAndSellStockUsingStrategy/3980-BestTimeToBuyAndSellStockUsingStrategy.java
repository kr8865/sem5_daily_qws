// Last updated: 8/17/2025, 10:26:29 AM
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;

        // Step 1: base profit without modification
        long baseProfit = 0;
        for (int i = 0; i < n; i++) {
            baseProfit += (long) strategy[i] * prices[i];
        }

        // Step 2: initialize first window [0..k-1]
        long oldWindow = 0;      // original contribution of this window
        long secondHalfSum = 0;  // sum of prices in last k/2 of window
        for (int i = 0; i < k; i++) {
            oldWindow += (long) strategy[i] * prices[i];
            if (i >= k / 2) secondHalfSum += prices[i];
        }
        long maxDelta = secondHalfSum - oldWindow;

        // Step 3: slide the window
        for (int l = 1; l + k - 1 < n; l++) {
            int r = l + k - 1;

            // update oldWindow
            oldWindow -= (long) strategy[l - 1] * prices[l - 1];
            oldWindow += (long) strategy[r] * prices[r];

            // update secondHalfSum
            secondHalfSum -= prices[l - 1 + k / 2];
            secondHalfSum += prices[r];

            long delta = secondHalfSum - oldWindow;
            maxDelta = Math.max(maxDelta, delta);
        }

        // Step 4: either no modification or best modification
        return baseProfit + Math.max(0, maxDelta);
    }
}
