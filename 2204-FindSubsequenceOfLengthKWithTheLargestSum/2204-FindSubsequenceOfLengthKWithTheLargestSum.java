// Last updated: 9/24/2025, 10:11:10 PM
import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        // Min-heap based on values
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i}); // store value and index
            if (pq.size() > k) {
                pq.poll(); // remove smallest
            }
        }

        // Extract the k largest elements
        List<int[]> list = new ArrayList<>(pq);
        // Sort by original index to preserve order
        list.sort((a, b) -> a[1] - b[1]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i)[0];
        }
        return res;
    }
}
