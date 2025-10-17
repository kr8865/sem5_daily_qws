// Last updated: 10/17/2025, 8:01:50 PM
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
