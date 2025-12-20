// Last updated: 20/12/2025, 16:19:51
1import java.util.HashMap;
2
3class Solution {
4    public int findLHS(int[] nums) {
5        HashMap<Integer, Integer> freq = new HashMap<>();
6
7        // Count frequency of each number
8        for (int num : nums) {
9            freq.put(num, freq.getOrDefault(num, 0) + 1);
10        }
11
12        int maxLen = 0;
13
14        // Check harmonic pairs
15        for (int key : freq.keySet()) {
16            if (freq.containsKey(key + 1)) {
17                maxLen = Math.max(
18                    maxLen,
19                    freq.get(key) + freq.get(key + 1)
20                );
21            }
22        }
23
24        return maxLen;
25    }
26}
27