// Last updated: 17/01/2026, 10:46:25
1class Solution {
2    class Pair implements Comparable<Pair>{
3        int src;
4        int time;
5        Pair(int src,int time){
6            this.src=src;
7            this.time=time;
8        }
9        @Override
10        public int compareTo(Pair p2){
11            return this.time-p2.time;
12        }
13
14    }
15    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
16        List<List<Pair>> ll=new ArrayList<>();
17        for(int i=0;i<n;i++){
18            ll.add(new ArrayList<>());
19        }
20        int[] res=new int[n];
21        Arrays.fill(res,-1);
22        for(int i=0;i<edges.length;i++){
23           
24                int u=edges[i][0];
25                int v=edges[i][1];
26                int time=edges[i][2];
27                ll.get(u).add(new Pair(v,time));
28                ll.get(v).add(new Pair(u,time));
29            
30
31        }
32        PriorityQueue<Pair> pq=new PriorityQueue<>();
33        pq.add(new Pair(0,0));
34        while(!pq.isEmpty()){
35            Pair p=pq.poll();
36            int src=p.src;
37            int time=p.time;
38            if(res[src]!=-1){
39                continue;
40            }
41            res[src]=time;
42            for(int i=0;i<ll.get(src).size();i++){
43                Pair q=ll.get(src).get(i);
44                int des=q.src;
45                int ntime=q.time;
46                if(time+ntime<disappear[des]){
47                    pq.add(new Pair(des,time+ntime));
48                }
49            }
50        }
51        return res;
52        
53    }
54}