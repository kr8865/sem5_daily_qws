// Last updated: 30/12/2025, 12:46:15
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        int n = grid.length;
4
5        if (grid[0][0] == 1 || grid[n-1][n-1] == 1)
6            return -1;
7
8        int[][] dir = {
9            {1,0},{0,1},{-1,0},{0,-1},
10            {1,1},{-1,-1},{-1,1},{1,-1}
11        };
12
13        Queue<int[]> q = new LinkedList<>();
14        q.add(new int[]{0,0});
15        grid[0][0] = 1;
16
17        int path = 1;
18
19        while(!q.isEmpty()){
20            int size = q.size();
21
22            for(int k = 0; k < size; k++){
23                int[] cur = q.poll();
24                int i = cur[0], j = cur[1];
25
26                if(i == n-1 && j == n-1)
27                    return path;
28
29                for(int[] d : dir){
30                    int ni = i + d[0];
31                    int nj = j + d[1];
32
33                    if(ni >= 0 && nj >= 0 && ni < n && nj < n && grid[ni][nj] == 0){
34                        q.add(new int[]{ni, nj});
35                        grid[ni][nj] = 1;
36                    }
37                }
38            }
39            path++;
40        }
41        return -1;
42    }
43}
44