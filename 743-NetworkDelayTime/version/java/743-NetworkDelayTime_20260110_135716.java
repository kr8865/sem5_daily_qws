// Last updated: 10/01/2026, 13:57:16
1class Solution {
2    class Pair implements Comparable<Pair>{
3        int src;
4        int cost;
5        Pair(int src,int cost){
6            this.src=src;
7            this.cost=cost;
8        }
9        @Override
10        public int compareTo(Pair p2){
11            return this.cost-p2.cost;
12        }
13    }
14    public int networkDelayTime(int[][] times, int n, int k) {
15        int[] dis=new int[n+1];
16        for(int i=0;i<=n;i++){
17            if(i!=k){
18                dis[i]=Integer.MAX_VALUE;
19            }
20        }
21        dis[k]=0;
22        ArrayList<ArrayList<Pair>> ll=new ArrayList<>();
23        PriorityQueue<Pair> pq=new PriorityQueue<>();
24        for(int i=0;i<=n;i++){
25            ll.add(new ArrayList<>());
26        }
27        for(int i=0;i<times.length;i++){
28            int u=times[i][0];
29            int v=times[i][1];
30            int cost=times[i][2];
31            ll.get(u).add(new Pair(v,cost));
32        }
33        pq.add(new Pair(k,0));
34        while(!pq.isEmpty()){
35            Pair p=pq.remove();
36            int src=p.src;
37            int curr=p.cost;
38            for(int i=0;i<ll.get(src).size();i++){
39                Pair v=ll.get(src).get(i);
40                int dest=v.src;
41                int new_cost=v.cost;
42                if(curr+new_cost<dis[dest]){
43                    dis[dest]=curr+new_cost;
44                    pq.add(new Pair(dest,dis[dest]));
45                }
46            }
47        }
48        int max=-1;
49        for(int i=1;i<=n;i++){
50            if(max<dis[i]){
51                max=dis[i];
52            }
53        }
54        if(max==Integer.MAX_VALUE){
55            return -1;
56        }
57        return max;
58
59
60       
61    }
62}
63