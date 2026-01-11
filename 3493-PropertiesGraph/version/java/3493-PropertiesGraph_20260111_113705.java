// Last updated: 11/01/2026, 11:37:05
1class Solution {
2    public int numberOfComponents(int[][] properties, int k) {
3          int n=properties.length;
4          List<List<Integer>> adj=new ArrayList();
5          for(int i=0;i<n;i++)
6           adj.add(new ArrayList());
7          for(int i=0;i<n;i++)
8          {
9            for(int j=i+1;j<n;j++)
10            {
11                 if(possible(properties[i],properties[j],k))
12                 {
13                     adj.get(i).add(j);
14                     adj.get(j).add(i);
15                 }
16            }
17          }
18          boolean vis[]=new boolean[n+1];
19          int cnt=0;
20          for(int i=0;i<n;i++)
21          {
22             if(!vis[i])
23             {
24                 dfs(i,vis,adj);
25                 cnt++;
26             }
27          }
28          return cnt;
29    }
30    public static void dfs(int node,boolean vis[],List<List<Integer>> adj)
31    {
32         vis[node]=true;
33         for(int it:adj.get(node))
34         {
35             if(!vis[it])
36              dfs(it,vis,adj);
37         }
38    }
39    public static boolean possible(int a[],int b[],int k)
40    {
41        Set<Integer> set1=new HashSet();
42        for(int ele:a)
43         set1.add(ele);
44        Set<Integer> set2=new HashSet();
45        for(int ele:b)
46        {
47            if(set1.contains(ele))
48             set2.add(ele);
49        }
50        return set2.size()>=k;
51    }
52}