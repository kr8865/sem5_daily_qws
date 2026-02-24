// Last updated: 24/02/2026, 11:02:50
1class Solution {
2    public int edgeScore(int[] edges) {
3       long[] ans=new long[edges.length];
4        for(int i=0;i<edges.length;i++){
5            int u=i;//o->v
6            int v=edges[i];
7            ans[v]+=i;
8        }
9        long max=-1;
10        int idx=-1;
11        for(int i=0;i<edges.length;i++){
12            if(ans[i]>max){
13                max=ans[i];
14                idx=i;
15            }
16            
17
18        }
19        return idx;
20        
21    }
22}