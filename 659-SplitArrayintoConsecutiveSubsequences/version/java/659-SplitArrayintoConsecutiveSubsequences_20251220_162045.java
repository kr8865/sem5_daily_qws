// Last updated: 20/12/2025, 16:20:45
1import java.util.HashMap;
2
3class Solution {
4    public boolean isPossible(int[] nums) {
5        HashMap<Integer, Integer> freq = new HashMap<>();
6        HashMap<Integer, Integer> need = new HashMap<>();
7
8        // Step 1: Count frequency
9        for (int num : nums) {
10            freq.put(num, freq.getOrDefault(num, 0) + 1);
11        }
12
13        // Step 2: Process each number
14        for (int num : nums) {
15            if (freq.get(num) == 0) continue;
16
17            // Case 1: Extend existing subsequence
18            if (need.getOrDefault(num, 0) > 0) {
19                need.put(num, need.get(num) - 1);
20                need.put(num + 1, need.getOrDefault(num + 1, 0) + 1);
21            }
22            // Case 2: Create new subsequence of length 3
23            else if (
24                freq.getOrDefault(num + 1, 0) > 0 &&
25                freq.getOrDefault(num + 2, 0) > 0
26            ) {
27                freq.put(num + 1, freq.get(num + 1) - 1);
28                freq.put(num + 2, freq.get(num + 2) - 1);
29                need.put(num + 3, need.getOrDefault(num + 3, 0) + 1);
30            }
31            // Case 3: Impossible
32            else {
33                return false;
34            }
35
36            // Use current number
37            freq.put(num, freq.get(num) - 1);
38        }
39
40        return true;
41    }
42}
43