// Last updated: 7/31/2025, 2:04:28 PM
class Solution {
    public void duplicateZeros(int[] arr) {
         int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                // Shift elements to the right
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++; // Skip the next index to prevent reprocessing the duplicated zero
            }
        }
    }
}