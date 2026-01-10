// Last updated: 10/01/2026, 16:35:55
1class Solution {
2    public int countPaths(int n, int[][] roads) {
3        HashMap<Integer,HashMap<Integer,Long>>map = new HashMap<>();
4        for(int i=0;i<n;i++){
5            map.put(i,new HashMap<>());
6        }
7        int mod = 1000000007;
8
9        for(int i[] : roads){
10            int v1 = i[0];
11            int v2 = i[1];
12            long cost = i[2];
13
14            map.get(v1).put(v2,cost);
15            map.get(v2).put(v1,cost);
16        }
17        PriorityQueue<Pair>pq= new PriorityQueue<>((a,b)->{
18            return Long.compare(a.cost,b.cost);
19        });
20        pq.add(new Pair(0,0));
21
22        long dist[] = new long [n];
23        Arrays.fill(dist,Long.MAX_VALUE);
24        dist[0]=0L;
25
26        long ways[] = new long[n];
27        ways[0]=1L;
28
29        while(!pq.isEmpty()){
30            Pair rm = pq.poll();
31
32            if(dist[rm.vtx]<rm.cost){
33                continue;
34            }
35
36            for(int ngbr : map.get(rm.vtx).keySet()){
37                long newCost = map.get(rm.vtx).get(ngbr)+rm.cost;
38                if(dist[ngbr]>newCost){
39                    dist[ngbr]=newCost;
40                    ways[ngbr] = ways[rm.vtx];
41                    pq.add(new Pair(ngbr,newCost));
42                }
43                else if(dist[ngbr]==newCost){
44                    ways[ngbr] = (ways[ngbr]+ways[rm.vtx])%mod;
45                }
46            }
47        }
48        return (int)ways[n-1];
49    }
50
51    class Pair{
52        int vtx;
53        long cost;
54        public Pair(int vtx,long cost){
55            this.vtx = vtx;
56            this.cost = cost;
57        }
58    }
59}