// Last updated: 11/01/2026, 11:21:15
1class Solution {
2
3    public int closestMeetingNode(int[] edges, int node1, int node2) {
4        int n = edges.length;
5
6        int[] dist1 = bfs(node1, edges);
7        int[] dist2 = bfs(node2, edges);
8
9        int ans = -1;
10        int best = Integer.MAX_VALUE;
11
12        for (int i = 0; i < n; i++) {
13            if (dist1[i] != -1 && dist2[i] != -1) {
14                int mx = Math.max(dist1[i], dist2[i]);
15                if (mx < best) {
16                    best = mx;
17                    ans = i;
18                }
19            }
20        }
21        return ans;
22    }
23
24    private int[] bfs(int start, int[] edges) {
25        int n = edges.length;
26        int[] dist = new int[n];
27        Arrays.fill(dist, -1);
28
29        Queue<Integer> q = new LinkedList<>();
30        q.add(start);
31        dist[start] = 0;
32
33        while (!q.isEmpty()) {
34            int u = q.poll();
35            int v = edges[u];
36
37            if (v != -1 && dist[v] == -1) {
38                dist[v] = dist[u] + 1;
39                q.add(v);
40            }
41        }
42        return dist;
43    }
44}
45