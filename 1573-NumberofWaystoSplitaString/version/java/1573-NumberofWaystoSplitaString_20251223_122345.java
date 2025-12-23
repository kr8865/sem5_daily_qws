// Last updated: 23/12/2025, 12:23:45
1class Solution {
2    static final int MOD = 1_000_000_007;
3
4    public int numWays(String s) {
5        int n = s.length();
6        long sum = 0;
7
8        for (int i = 0; i < n; i++) {
9            if (s.charAt(i) == '1') sum++;
10        }
11
12        if (sum % 3 != 0) return 0;
13
14        // all zeros case
15        if (sum == 0) {
16            long ways = (long)(n - 1) * (n - 2) / 2;
17            return (int)(ways % MOD);
18        }
19
20        long target = sum / 3;
21        long curr = 0;
22        long count1 = 0, count2 = 0;
23
24        for (int i = 0; i < n; i++) {
25            if (s.charAt(i) == '1') curr++;
26
27            if (curr == target) count1++;
28            else if (curr == 2 * target) count2++;
29        }
30
31        return (int)((count1 * count2) % MOD);
32    }
33}
34