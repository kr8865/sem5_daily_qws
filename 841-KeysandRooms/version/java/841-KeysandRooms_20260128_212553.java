// Last updated: 28/01/2026, 21:25:53
1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        ArrayList<ArrayList<Integer>> ll=new ArrayList<>();
4        for(int i=0;i<rooms.size();i++){
5            ll.add(new ArrayList<>());
6        }
7        for(int i=0;i<rooms.size();i++){
8            for(int j=0;j<rooms.get(i).size();j++){
9                int v=rooms.get(i).get(j);
10                ll.get(i).add(v);
11
12            }
13            
14
15        }
16        Queue<Integer> q=new LinkedList<>();
17        q.add(0);
18        boolean[] vis=new boolean[rooms.size()];
19        while(!q.isEmpty()){
20            int t=q.poll();
21            if(vis[t]){
22                continue;
23            }
24            vis[t]=true;
25            for(int i=0;i<ll.get(t).size();i++){
26                int n=ll.get(t).get(i);
27                if(!vis[n]){
28                    q.add(n);
29                }
30            }
31
32        }
33        boolean ans=false;
34        for(int i=0;i<vis.length;i++){
35            if(vis[i]==false){
36                return false;
37            }
38        }
39        return true;
40    }
41}