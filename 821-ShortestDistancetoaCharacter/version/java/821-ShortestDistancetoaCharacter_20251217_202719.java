// Last updated: 17/12/2025, 20:27:19
1class Solution {
2    public int[] shortestToChar(String s, char c) {
3        int n = s.length();
4        int[] ans = new int[n];
5
6        for (int left = 0; left < n; left++) {
7            int right = left;
8            int dist = Integer.MAX_VALUE;
9
10            // Search on right side for next c
11            while (right < n && s.charAt(right) != c) {
12                right++;
13            }
14            if (right < n) {
15                dist = Math.min(dist, right - left);
16            }
17
18            // Search on left side for previous c
19            int r2 = left;
20            while (r2 >= 0 && s.charAt(r2) != c) {
21                r2--;
22            }
23            if (r2 >= 0) {
24                dist = Math.min(dist, left - r2);
25            }
26
27            ans[left] = dist;
28        }
29
30        return ans;
31    }
32}
33