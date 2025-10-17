// Last updated: 10/17/2025, 8:01:52 PM
import java.util.*;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0, j = 0;
        List<int[]> merged = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                // Keys match → sum values
                merged.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                merged.add(new int[]{nums1[i][0], nums1[i][1]});
                i++;
            } else {
                merged.add(new int[]{nums2[j][0], nums2[j][1]});
                j++;
            }
        }

        // Add remaining elements
        while (i < nums1.length) merged.add(nums1[i++]);
        while (j < nums2.length) merged.add(nums2[j++]);

        // Convert List back to array
        return merged.toArray(new int[merged.size()][]);
    }
}
