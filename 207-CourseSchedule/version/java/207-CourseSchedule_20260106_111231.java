// Last updated: 06/01/2026, 11:12:31
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        int[] indeg=new int[numCourses];
4       int count=0;
5        for(int i=0;i<prerequisites.length;i++){
6            indeg[prerequisites[i][0]]++;
7        }
8        Queue<Integer> q=new LinkedList<>();
9        for(int i=0;i<indeg.length;i++){
10            if(indeg[i]==0){
11                q.add(i);
12            }
13        }
14        while(!q.isEmpty()){
15            int v=q.poll();
16            count++;
17            
18            for(int i=0;i<prerequisites.length;i++){
19                if(prerequisites[i][1]==v){
20                    indeg[prerequisites[i][0]]--;
21                    if(indeg[prerequisites[i][0]]==0){
22                        q.add(prerequisites[i][0]);
23                    }
24                }
25            }
26        }
27        return count==numCourses;
28    }
29}