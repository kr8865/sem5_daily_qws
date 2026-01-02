// Last updated: 02/01/2026, 11:32:03
1class Solution {
2    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
3        List<List<Integer>> ans = new LinkedList();
4        List<Integer> current = new ArrayList();
5        current.add(0);
6        dfs(0,current,graph,graph.length-1,ans);
7        return ans; 
8    }
9    private void dfs(int src, List<Integer> current, int graph[][], int dest, List<List<Integer>> ans){
10        if(src == dest){
11            ans.add(new ArrayList(current));
12            return;
13        }
14        for(int n : graph[src]){
15            current.add(n);
16            dfs(n,current,graph,dest,ans);
17            current.remove(current.size()-1);
18        }
19    }
20}