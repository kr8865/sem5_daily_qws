// Last updated: 08/02/2026, 10:12:27
1import java.util.*;
2
3class Solution {
4    public long countSubarrays(int[] nums, long k) {
5
6        int l = 0;
7        long c = 0;
8
9        Deque<Integer> minDq = new ArrayDeque<>();
10        Deque<Integer> maxDq = new ArrayDeque<>();
11
12        for (int r = 0; r < nums.length; r++) {
13
14            // update max deque
15            while (!maxDq.isEmpty() && maxDq.peekLast() < nums[r]) {
16                maxDq.pollLast();
17            }
18            maxDq.addLast(nums[r]);
19
20            // update min deque
21            while (!minDq.isEmpty() && minDq.peekLast() > nums[r]) {
22                minDq.pollLast();
23            }
24            minDq.addLast(nums[r]);
25
26            // shrink window
27            while ((long)(maxDq.peekFirst() - minDq.peekFirst()) * (r - l + 1) > k) {
28
29                if (nums[l] == maxDq.peekFirst()) maxDq.pollFirst();
30                if (nums[l] == minDq.peekFirst()) minDq.pollFirst();
31                l++;
32            }
33
34            // count subarrays
35            c += (r - l + 1);
36        }
37
38        return c;
39    }
40}
41