// Last updated: 09/02/2026, 15:51:49
1class Solution {
2    public int[] cycleLengthQueries(int n, int[][] queries) {
3        int m = queries.length, res[] = new int[m];
4        for (int i = 0; i < m; ++i) {
5            res[i]++;
6            int x = queries[i][0], y = queries[i][1];
7            while (x != y) {
8                if (x > y)
9                    x /= 2;
10                else
11                    y /= 2;
12                res[i]++;
13            }
14        }
15        return res;
16    }
17}