// Last updated: 20/12/2025, 16:24:11
1class Solution {
2    public int[] prisonAfterNDays(int[] cells, int N) {
3
4        if (N == 0) return cells;
5
6        // Cycle length is always 14
7        N = (N - 1) % 14 + 1;
8
9        for (int day = 0; day < N; day++) {
10            int[] next = new int[8];
11
12            for (int i = 1; i < 7; i++) {
13                next[i] = (cells[i - 1] == cells[i + 1]) ? 1 : 0;
14            }
15
16            cells = next;
17        }
18
19        return cells;
20    }
21}
22