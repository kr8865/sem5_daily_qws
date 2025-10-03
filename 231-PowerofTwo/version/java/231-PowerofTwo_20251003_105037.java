// Last updated: 10/3/2025, 10:50:37 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;   // powers of two are always positive
        if (n == 1) return true;    // base case: 2^0 = 1
        if (n % 2 != 0) return false; // odd numbers > 1 are never power of two
        return isPowerOfTwo(n / 2);  // recursively divide by 2
    }
}
