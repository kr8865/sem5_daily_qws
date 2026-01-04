// Last updated: 04/01/2026, 10:48:43
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
4        int n=isConnected.length;
5        for(int i=0;i<n;i++){
6            ArrayList<Integer> ll=new ArrayList<>();
7            for(int j=0;j<n;j++){
8                if(i!=j && isConnected[i][j]==1){
9                    ll.add(j);
10                }
11            }
12            result.add(ll);
13        }
14        int c=0;
15        boolean[] vis=new boolean[n];
16        for(int i=0;i<n;i++){
17            if(!vis[i]){
18                bfs(i,vis,result);
19                c++;
20            }
21            
22        }
23        return c;
24    }
25    public static void bfs(int root,boolean[] vis,ArrayList<ArrayList<Integer>> result){
26        Queue<Integer> q=new LinkedList<>();
27        q.add(root);
28        while(!q.isEmpty()){
29            int v=q.poll();
30            if(vis[v]){
31                continue;
32            }
33            vis[v]=true;
34            for(int i=0;i<result.get(v).size();i++){
35                int n=result.get(v).get(i);
36                if(!vis[n]){
37                    q.add(n);
38                }
39            }
40        }
41
42
43    }
44}