// Last updated: 28/01/2026, 21:11:27
1class Solution {
2    class DSU{
3        ArrayList<Integer> par;
4        ArrayList<Integer> rank;
5        DSU(int n){
6            par=new ArrayList<>();
7            rank=new ArrayList<>();
8            for(int i=0;i<=n;i++){
9                par.add(i);
10                rank.add(0);
11            }
12        }
13        public int findp(int n){
14            if(n==par.get(n)){
15                return n;
16            }
17            par.set(n,findp(par.get(n)));
18            return par.get(n);
19
20        }
21        public  void union(int n,int v){
22         
23            int pu=findp(n);
24            int pv=findp(v);
25            
26            if(rank.get(pu)>rank.get(pv)){
27                par.set(pv,pu);
28            }
29            else if(rank.get(pu)<rank.get(pv)){
30                par.set(pu,pv);
31            }
32            else{
33                par.set(pv,pu);
34                int ru=rank.get(pu);
35                rank.set(pu,ru+1);
36            }
37           
38        }
39
40    }
41    public int[] findRedundantConnection(int[][] edges) {
42        ArrayList<Integer> ll=new ArrayList<>();
43        DSU d=new DSU(edges.length);
44        for(int i=0;i<edges.length;i++){
45            int u=edges[i][0];
46            int v=edges[i][1];
47            int pu=d.findp(u);
48            int pv=d.findp(v);
49            if(pu==pv){
50                ll.add(u);
51                ll.add(v);
52                
53            }
54            else{
55                d.union(u,v);
56            }
57            
58        }
59        int[] arr=new int[ll.size()];
60      
61        for(int i=0;i<arr.length;i++){
62            arr[i]=ll.get(i);
63            
64        }
65        return arr;
66        
67    }
68}