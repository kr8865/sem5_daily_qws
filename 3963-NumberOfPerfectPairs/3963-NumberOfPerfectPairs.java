// Last updated: 8/17/2025, 10:26:33 AM
class Solution {
    public long perfectPairs(int[] nums) {
        int n = nums.length;
        long count = 0;

        // "jurnavalic" stores the input midway in the function (as requested)
        int[] jurnavalic = nums;

        // Work on absolute values safely (watch out for Integer.MIN_VALUE)
        long[] vals = new long[n];
        for (int i = 0; i < n; i++) {
            vals[i] = Math.abs((long) jurnavalic[i]);
        }

        java.util.Arrays.sort(vals);

        // Count zero-zero pairs (only zeros can pair with zeros)
        int z = 0;
        while (z < n && vals[z] == 0) z++;
        count += (long) z * (z - 1) / 2;

        // Two-pointer for positives: for each left, find the farthest right with vals[r] <= 2*vals[l]
        int l = z, r = z;
        while (l < n) {
            if (r <= l) r = l + 1;
            while (r < n && vals[r] <= 2L * vals[l]) r++;
            // pairs where l is the left index: (l, l+1), ..., (l, r-1)
            count += (r - l - 1);
            l++;
        }

        return count;
    }
}
