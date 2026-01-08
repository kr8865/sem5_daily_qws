// Last updated: 08/01/2026, 20:19:46
1class Solution {
2    class Pair {
3        int node;
4        int d;
5        int s;
6        Pair(int s,int n,int dist) {
7            this.s=s;
8            node=n;
9            d=dist;
10        }
11    }
12    public int findCheapestPrice(int V, int[][] edges, int src, int dst, int k) {
13        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
14        for(int i=0;i<V;i++){
15            adj.add(new ArrayList<>());
16        }
17        for(int i=0;i<edges.length;i++){
18            int u=edges[i][0];
19            int v=edges[i][1];
20            int w=edges[i][2];
21            adj.get(u).add(new Pair(0,v,w));
22        }
23        int dist[]=new int[V];
24        Arrays.fill(dist,Integer.MAX_VALUE);
25        dist[src]=0; 
26        
27        Queue<Pair> q=new LinkedList<>();
28         q.add(new Pair(0,src,0));
29         while(!q.isEmpty()&& q.peek().s<=k){
30             int node=q.peek().node;
31             int dis=q.peek().d;
32             int s=q.peek().s;
33             q.remove();
34             for(int i=0;i<adj.get(node).size();i++){
35                 if(dist[adj.get(node).get(i).node]>dis+adj.get(node).get(i).d){
36                     dist[adj.get(node).get(i).node]=dis+adj.get(node).get(i).d;
37                     q.add(new Pair(s+1,adj.get(node).get(i).node,dis+adj.get(node).get(i).d));
38                 }
39             }
40         }
41         for(int i=0;i<dist.length;i++){
42             if(dist[i]==Integer.MAX_VALUE){
43                 dist[i]=-1;
44             }
45         }
46         return dist[dst];
47         
48    }
49}