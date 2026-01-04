// Last updated: 04/01/2026, 12:20:04
1class Solution {
2
3    class Pair {
4        int i, j;
5        Pair(int i, int j) {
6            this.i = i;
7            this.j = j;
8        }
9    }
10
11    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
12
13        int original = image[sr][sc];
14        if (original == color) return image;
15
16        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
17        Queue<Pair> q = new LinkedList<>();
18
19        q.add(new Pair(sr, sc));
20        image[sr][sc] = color;
21
22        while (!q.isEmpty()) {
23            Pair p = q.poll();
24            int x = p.i, y = p.j;
25
26            for (int[] d : dir) {
27                int r = x + d[0];
28                int c = y + d[1];
29
30                if (r >= 0 && c >= 0 &&
31                    r < image.length && c < image[0].length &&
32                    image[r][c] == original) {
33
34                    image[r][c] = color;
35                    q.add(new Pair(r, c));
36                }
37            }
38        }
39        return image;
40    }
41}
42