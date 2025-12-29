// Last updated: 29/12/2025, 20:03:21
1import java.util.*;
2
3class Solution {
4    public int findMinimumTime(List<Integer> strength, int k) {
5        int n = strength.size();
6        int maxMask = 1 << n;
7        long[] dp = new long[maxMask];
8        Arrays.fill(dp, Long.MAX_VALUE);
9        dp[0] = 0;
10
11        for (int mask = 0; mask < maxMask; mask++) {
12            int cnt = Integer.bitCount(mask);
13            long x = 1L + (long) cnt * k;
14
15            for (int i = 0; i < n; i++) {
16                if ((mask & (1 << i)) == 0) {
17                    long time = (strength.get(i) + x - 1) / x;
18                    int nextMask = mask | (1 << i);
19                    dp[nextMask] = Math.min(dp[nextMask], dp[mask] + time);
20                }
21            }
22        }
23
24        return (int) dp[maxMask - 1];
25    }
26}
27