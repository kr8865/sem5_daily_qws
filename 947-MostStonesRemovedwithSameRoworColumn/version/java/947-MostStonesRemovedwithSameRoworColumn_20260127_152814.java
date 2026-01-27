// Last updated: 27/01/2026, 15:28:14
1class Solution {
2    public int removeStones(int[][] stones) {
3        int n = stones.length;
4        if (n <= 1) {
5            return 0;
6        }
7
8        List<Integer>[] graph = new List[n];
9        for (int i = 0; i < n; i++) {
10            graph[i] = new ArrayList<>();
11        }
12
13        for (int i = 0; i < n; i++) {
14            int[] u = stones[i];
15            for (int j = 0; j < n; j++) {
16                if (i == j) {
17                    continue;
18                }
19
20                int[] v = stones[j];
21                if (u[0] == v[0] || u[1] == v[1]) {
22                    graph[i].add(j);
23                }
24            }
25        }
26
27        boolean[] visited = new boolean[n];
28        int ans = 0;
29
30        for (int i = 0; i < n; i++) {
31            if (visited[i]) {
32                continue;
33            }
34
35            dfs(graph, visited, i);
36            ans++;
37        }
38
39        return n - ans;
40    }
41
42    private static void dfs(List<Integer>[] graph, boolean[] visited, int start) {
43
44        visited[start] = true;
45
46        List<Integer> neighbors = graph[start];
47        for (int x : neighbors) {
48            if (visited[x]) {
49                continue;
50            }
51
52            dfs(graph, visited, x);
53        }
54    }
55}