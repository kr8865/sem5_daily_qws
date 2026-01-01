// Last updated: 01/01/2026, 19:46:29
1class Solution {
2    int dp[];
3    //We use memoization
4    public int countRestrictedPaths(int n, int[][] edges) {
5        int[] dist = new int[n+1];
6        dp = new int[n+1];
7        Arrays.fill(dp,-1);
8        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
9        //Create the graph from input edges
10        for(int[] e : edges){
11            graph.putIfAbsent(e[0], new HashMap<>());
12            graph.putIfAbsent(e[1], new HashMap<>());
13            graph.get(e[0]).put(e[1],e[2]);
14            graph.get(e[1]).put(e[0],e[2]);
15        }
16        //Single source shortest distance - something like Dijkstra's
17        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[1]-b[1]));
18        int[] base = new int[2];
19        base[0]=n;
20        pq.offer(base);
21        while(!pq.isEmpty()){
22            int[] currNode = pq.poll();
23            
24            for(Map.Entry<Integer, Integer> neighbour: graph.get(currNode[0]).entrySet()){
25                int node = neighbour.getKey();
26                int d = neighbour.getValue()+currNode[1];
27                if(node==n) continue;
28                //Select only those neighbours, whose new distance is less than existing distance
29                //New distance = distance of currNode from n + weight of edge between currNode and neighbour
30            
31                if( dist[node]==0 || d < dist[node]){
32                    int[] newNode = new int[2];
33                    newNode[0]=node;
34                    newNode[1]=d;
35                    pq.offer(newNode);
36                    dist[node]= d;
37                }
38            }
39        }
40
41        return find(1,graph,n,dist);
42    }
43    //This method traverses all the paths from source node to n though it's neigbours
44    private int find(int node, Map<Integer, Map<Integer, Integer>> graph, int n, int[] dist ){
45        if(node==n){
46            return 1;
47        }
48        
49        //Memoization avoid computaion of common subproblems. 
50        if(dp[node]!=-1) return dp[node];
51
52        int ans = 0;
53        for(Map.Entry<Integer, Integer> neighbour: graph.get(node).entrySet()){
54                int currNode = neighbour.getKey();
55                int d = dist[currNode];
56                if( dist[node] > d){
57                    ans = (ans + find(currNode, graph, n, dist)) % 1000000007;
58            }
59        }
60        
61        return dp[node] = ans;
62    }
63}