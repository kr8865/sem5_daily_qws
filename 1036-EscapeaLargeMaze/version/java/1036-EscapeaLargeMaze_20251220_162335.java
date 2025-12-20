// Last updated: 20/12/2025, 16:23:35
1import java.util.*;
2
3class Solution {
4
5    private static final int GRID = 1000000;
6    private static final int[][] DIRS = {{1,0},{-1,0},{0,1},{0,-1}};
7
8    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
9        Set<Long> blockedSet = new HashSet<>();
10        for (int[] b : blocked) {
11            blockedSet.add(encode(b[0], b[1]));
12        }
13
14        int limit = blocked.length * blocked.length / 2;
15
16        return bfs(source, target, blockedSet, limit)
17            && bfs(target, source, blockedSet, limit);
18    }
19
20    private boolean bfs(int[] start, int[] end, Set<Long> blocked, int limit) {
21        Set<Long> visited = new HashSet<>();
22        Queue<int[]> q = new LinkedList<>();
23
24        q.offer(start);
25        visited.add(encode(start[0], start[1]));
26
27        while (!q.isEmpty() && visited.size() <= limit) {
28            int[] cur = q.poll();
29
30            if (cur[0] == end[0] && cur[1] == end[1]) {
31                return true;
32            }
33
34            for (int[] d : DIRS) {
35                int nx = cur[0] + d[0];
36                int ny = cur[1] + d[1];
37
38                if (nx >= 0 && ny >= 0 && nx < GRID && ny < GRID) {
39                    long key = encode(nx, ny);
40                    if (!blocked.contains(key) && visited.add(key)) {
41                        q.offer(new int[]{nx, ny});
42                    }
43                }
44            }
45        }
46
47        // If expanded beyond limit → not enclosed
48        return visited.size() > limit;
49    }
50
51    private long encode(int x, int y) {
52        return ((long) x << 32) | y;
53    }
54}
55