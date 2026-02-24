// Last updated: 24/02/2026, 16:05:42
1class Solution {
2    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
3        int[][] cost=new int[n][n];
4        for(int[]temp:cost){
5            Arrays.fill(temp,-1);
6
7        }
8        for(int i=0;i<edges.length;i++){
9            int u=edges[i][0];
10            int v=edges[i][1];
11            int cos=edges[i][2];
12            cost[u][v]=cos;
13            cost[v][u]=cos;
14                    
15        }
16        for(int i=0;i<n;i++){
17            cost[i][i]=0;        
18        }
19        for(int k=0;k<n;k++){
20            for(int i=0;i<n;i++){
21                for(int j=0;j<n;j++){
22                    if(cost[i][k]==-1 || cost[k][j]==-1){
23                        continue;
24                    }
25                    if(cost[i][j]==-1){
26                        cost[i][j]=cost[i][k]+cost[k][j];
27                    }
28                    else{
29                        cost[i][j]=Math.min(cost[i][j],(cost[i][k]+cost[k][j]));
30                    }
31
32                }
33            }
34        }
35        int[] ans=new int[n];
36        for(int i=0;i<n;i++){
37            for(int j=0;j<n;j++){
38                if(cost[i][j]<=distanceThreshold){
39                    ans[i]++;
40                }
41            }
42        }
43        int min=10000;
44        int v=-1;
45        for(int i=0;i<ans.length;i++){
46            if(ans[i]<=min){
47                v=i;
48                min=ans[i];
49                
50            }
51        }
52        return v;
53        
54    }
55}