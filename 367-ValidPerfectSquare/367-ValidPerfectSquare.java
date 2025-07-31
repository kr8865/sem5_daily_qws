// Last updated: 7/31/2025, 2:06:10 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;
        int ans = 0;

        while (low <= high) {
            // Use long to avoid overflow when calculating mid * mid
            long mid = low + (high - low) / 2;
            long midSquared = mid * mid;

            if (midSquared == num) {
                return true; // Exact square root found
            }

            // If midSquared is less than x, move the low boundary up
            if (midSquared < num) {
                low = (int) mid + 1;
                ans = (int) mid; // Update the answer with the current mid
            } else {
                // If midSquared is greater than x, move the high boundary down
                high = (int) mid - 1;
            }
        }

        return false; // Return the integer part of the square root
    }
}