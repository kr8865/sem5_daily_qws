// Last updated: 30/12/2025, 13:22:41
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        // Edge case
4        if (n == 1) return 1;
5
6        int[] score = new int[n + 1];
7
8        for (int[] t : trust) {
9            int a = t[0];
10            int b = t[1];
11            score[a]--; // a trusts someone
12            score[b]++; // b is trusted
13        }
14
15        for (int i = 1; i <= n; i++) {
16            if (score[i] == n - 1) {
17                return i;
18            }
19        }
20
21        return -1;
22    }
23}
24