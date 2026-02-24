// Last updated: 24/02/2026, 10:40:15
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
4        for(int i=0;i<n;i++){
5            graph.add(new ArrayList<>());
6        }
7        for(int i=0;i<edges.length;i++){
8            int u=edges[i][0];
9            int v=edges[i][1];
10            graph.get(u).add(v);
11            graph.get(v).add(u);
12        }
13        Queue<Integer> q=new LinkedList<>();
14        boolean[] vis=new boolean[n];
15        q.add(source);
16        while(!q.isEmpty()){
17            int v=q.poll();
18            if(v==destination){
19                return true;
20            }
21            if(vis[v]){
22                continue;
23            }
24            vis[v]=true;
25            for(int i=0;i<graph.get(v).size();i++){
26                int e=graph.get(v).get(i);
27                q.add(e);
28            }
29        }
30        return false;
31        
32    }
33}