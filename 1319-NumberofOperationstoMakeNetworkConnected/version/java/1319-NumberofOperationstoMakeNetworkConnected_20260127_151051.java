// Last updated: 27/01/2026, 15:10:51
1class Solution {
2    public int makeConnected(int n, int[][] connections) {
3        if(connections.length<n-1){
4            return -1;
5        }
6
7        return countComponent(n,connections);
8    }
9    public static int countComponent(int n,int[][] connections){
10        int c=0;
11        ArrayList<ArrayList<Integer>> ll=new ArrayList<>();
12        for(int i=0;i<n;i++){
13            ll.add(new ArrayList<>());
14        }
15        boolean[] vis=new boolean[n];
16        for(int i=0;i<connections.length;i++){
17            int u=connections[i][0];
18            int v=connections[i][1];
19            ll.get(u).add(v);
20            ll.get(v).add(u);
21        }
22        for(int i=0;i<n;i++){
23            if(!vis[i]){
24            dfs(i,ll,vis);
25            c++;
26            }
27        }
28        return c-1;
29    }
30    public static void dfs(int node,ArrayList<ArrayList<Integer>> ll,boolean[] vis){
31        vis[node]=true;
32        for(int i=0;i<ll.get(node).size();i++){
33            int e=ll.get(node).get(i);
34            if(!vis[e]){
35                
36                dfs(e,ll,vis);
37            }
38        }
39
40    }
41}