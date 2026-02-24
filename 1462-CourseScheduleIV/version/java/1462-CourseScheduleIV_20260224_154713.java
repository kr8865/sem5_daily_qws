// Last updated: 24/02/2026, 15:47:13
1class Solution {
2    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
3        boolean[][] connected=new boolean[n][n];
4        for(int i=0;i<prerequisites.length;i++){
5            connected[prerequisites[i][0]][prerequisites[i][1]]=true;
6        }
7        for(int k=0;k<n;k++){
8            for(int i=0;i<n;i++){
9                for(int j=0;j<n;j++){
10                    connected[i][j]=connected[i][j]|| connected[i][k]&& connected[k][j];
11                }
12            }
13        }
14        ArrayList<Boolean> ans=new ArrayList<>();
15        for(int i=0;i<queries.length;i++){
16            ans.add(connected[queries[i][0]][queries[i][1]]);
17        }
18        return ans;
19
20    }
21}