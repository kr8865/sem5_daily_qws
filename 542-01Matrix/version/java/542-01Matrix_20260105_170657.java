// Last updated: 05/01/2026, 17:06:57
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        if (mat == null || mat.length == 0 || mat[0].length == 0)
4            return new int[0][0];
5
6        int m = mat.length, n = mat[0].length;
7        Queue<int[]> queue = new LinkedList<>();
8        int MAX_VALUE = m * n;
9        
10        for (int i = 0; i < m; i++) {
11            for (int j = 0; j < n; j++) {
12                if (mat[i][j] == 0) {
13                    queue.offer(new int[]{i, j});
14                } else {
15                    mat[i][j] = MAX_VALUE;
16                }
17            }
18        }
19        
20        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
21        
22        while (!queue.isEmpty()) {
23            int[] cell = queue.poll();
24            for (int[] dir : directions) {
25                int r = cell[0] + dir[0], c = cell[1] + dir[1];
26                if (r >= 0 && r < m && c >= 0 && c < n && mat[r][c] > mat[cell[0]][cell[1]] + 1) {
27                    queue.offer(new int[]{r, c});
28                    mat[r][c] = mat[cell[0]][cell[1]] + 1;
29                }
30            }
31        }
32        
33        return mat;
34    }
35}