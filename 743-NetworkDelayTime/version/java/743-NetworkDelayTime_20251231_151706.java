// Last updated: 31/12/2025, 15:17:06
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3
4        // Adjacency list: node -> (neighbor, weight)
5        List<int[]>[] graph = new ArrayList[n + 1];
6        for (int i = 1; i <= n; i++) {
7            graph[i] = new ArrayList<>();
8        }
9
10        for (int[] t : times) {
11            graph[t[0]].add(new int[]{t[1], t[2]});
12        }
13
14        // Distance array
15        int[] dist = new int[n + 1];
16        Arrays.fill(dist, Integer.MAX_VALUE);
17        dist[k] = 0;
18
19        // Min heap: (time, node)
20        PriorityQueue<int[]> pq =
21                new PriorityQueue<>((a, b) -> a[0] - b[0]);
22
23        pq.offer(new int[]{0, k});
24
25        while (!pq.isEmpty()) {
26            int[] cur = pq.poll();
27            int time = cur[0];
28            int node = cur[1];
29
30            // Skip outdated entry
31            if (time > dist[node]) continue;
32
33            for (int[] nei : graph[node]) {
34                int next = nei[0];
35                int w = nei[1];
36
37                if (dist[next] > time + w) {
38                    dist[next] = time + w;
39                    pq.offer(new int[]{dist[next], next});
40                }
41            }
42        }
43
44        int ans = 0;
45        for (int i = 1; i <= n; i++) {
46            if (dist[i] == Integer.MAX_VALUE) return -1;
47            ans = Math.max(ans, dist[i]);
48        }
49
50        return ans;
51    }
52}
53