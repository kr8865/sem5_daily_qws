// Last updated: 8/26/2025, 9:51:47 PM
import java.util.*;

class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>(); // min-heap
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll(); // remove smallest
            }
        }
    }

    public int add(int val) {
        pq.add(val);
        if (pq.size() > k) {
            pq.poll();
        }
        return pq.peek(); // kth largest
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
