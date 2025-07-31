// Last updated: 7/31/2025, 2:07:02 PM
class Solution {
    public int trailingZeroes(int n) {
        int d=(n/5)+(n/25)+(n/125)+(n/625)+(n/3125);
        return d;
        
    }
}