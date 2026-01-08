// Last updated: 08/01/2026, 21:05:44
1class Solution {
2    class Pair {
3        int src;
4        int cost;
5        int stops;
6        Pair(int src,int cost,int stops){
7            this.src=src;
8            this.cost=cost;
9            this.stops=stops;
10        }
11    }
12
13    public int findCheapestPrice(int V, int[][] edges, int src, int dst, int k) {
14
15        ArrayList<ArrayList<Pair>> ll=new ArrayList<>();
16        for(int i=0;i<V;i++){
17            ll.add(new ArrayList<>());
18        }
19
20        for(int i=0;i<edges.length;i++){
21            int u=edges[i][0];
22            int v=edges[i][1];
23            int cost=edges[i][2];
24            ll.get(u).add(new Pair(v,cost,0));
25        }
26
27        int[] dist=new int[V];
28        for(int i=0;i<V;i++){
29            dist[i]=Integer.MAX_VALUE;
30        }
31        dist[src]=0;
32
33        Queue<Pair> q=new LinkedList<>();
34        q.add(new Pair(src,0,0));
35
36        while(!q.isEmpty()){
37            Pair v=q.poll();
38            int sr=v.src;
39            int cost=v.cost;
40            int stops=v.stops;
41
42            if(stops > k) continue;
43
44            for(int i=0;i<ll.get(sr).size();i++){
45                Pair p=ll.get(sr).get(i);
46                int dest=p.src;
47                int newc=p.cost;
48
49                if(cost + newc < dist[dest]){
50                    dist[dest] = cost + newc;
51                    q.add(new Pair(dest, dist[dest], stops+1));
52                }
53            }
54        }
55
56        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
57    }
58}
59