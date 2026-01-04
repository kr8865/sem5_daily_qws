// Last updated: 04/01/2026, 11:59:48
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        Queue<int[]> q = new LinkedList<>();
4        int freshOranges = 0;
5        for(int i=0; i<grid.length; i++){
6            for(int j=0; j<grid[0].length; j++){
7                if(grid[i][j]==2){
8                    q.offer(new int[] {i,j});
9                }
10                else if(grid[i][j]==1){
11                    freshOranges++;
12                }
13            }
14        }
15
16        if(freshOranges==0) return 0;
17        int time = 0;
18        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
19        while(!q.isEmpty()){
20            int n = q.size();
21
22            while(n-->0){
23                int[] curr = q.poll();
24                for(int[] d : dir){
25                    int r = curr[0]+d[0];
26                    int c = curr[1]+d[1];
27                    if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c]==1){
28                        grid[r][c] = 2;
29                        freshOranges--;
30                        q.offer(new int[] {r,c});
31                    }
32                }
33            }
34            time++;
35        }
36
37        if(freshOranges==0) return time-1;
38        return -1;
39    }
40}