// Last updated: 8/17/2025, 10:26:37 AM
class Solution {
    public int minSensors(int n, int m, int k) {
        int blockSize = 2 * k + 1;

        
        int rows = (n + blockSize - 1) / blockSize;
        int cols = (m + blockSize - 1) / blockSize;

        return rows * cols;
    }
}
