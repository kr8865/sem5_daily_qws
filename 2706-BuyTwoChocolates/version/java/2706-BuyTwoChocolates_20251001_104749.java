// Last updated: 10/1/2025, 10:47:49 AM
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices); // Sort ascending
        int cost = prices[0] + prices[1]; // Buy the 2 cheapest
        if (cost > money) {
            return money; // Not enough money
        }
        return money - cost; // Remaining money
    }
}
