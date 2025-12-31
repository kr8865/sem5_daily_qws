// Last updated: 31/12/2025, 15:45:08
1class Solution {
2    public int minimumEffortPath(int[][] heights) {
3        int n = heights.length;
4        int m = heights[0].length;
5
6        int[][] effort = new int[n][m];
7        for (int[] row : effort)
8            Arrays.fill(row, Integer.MAX_VALUE);
9
10        PriorityQueue<int[]> pq = new PriorityQueue<>(
11            (a, b) -> a[0] - b[0]
12        );
13
14        pq.add(new int[]{0, 0, 0}); // effort, row, col
15        effort[0][0] = 0;
16
17        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
18
19        while (!pq.isEmpty()) {
20            int[] cur = pq.poll();
21            int e = cur[0], r = cur[1], c = cur[2];
22
23            if (r == n - 1 && c == m - 1)
24                return e;
25
26            if (e > effort[r][c]) continue;
27
28            for (int[] d : dirs) {
29                int nr = r + d[0];
30                int nc = c + d[1];
31
32                if (nr >= 0 && nc >= 0 && nr < n && nc < m) {
33                    int ne = Math.max(
34                        e,
35                        Math.abs(heights[r][c] - heights[nr][nc])
36                    );
37
38                    if (ne < effort[nr][nc]) {
39                        effort[nr][nc] = ne;
40                        pq.add(new int[]{ne, nr, nc});
41                    }
42                }
43            }
44        }
45        return 0;
46    }
47}
48