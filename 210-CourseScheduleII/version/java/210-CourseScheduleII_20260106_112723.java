// Last updated: 06/01/2026, 11:27:23
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        int n=numCourses;
4        int m=prerequisites.length;
5        int[] indeg=new int[n];
6        int[] ans=new int[n];
7        for(int i=0;i<m;i++){
8            indeg[prerequisites[i][0]]++;
9        }
10        Queue<Integer> q=new LinkedList<>();
11        for(int i=0;i<n;i++){
12            if(indeg[i]==0){
13                q.add(i);
14            }
15        }
16        int k=0;
17        int c=0;
18        while(!q.isEmpty()){
19            int v=q.poll();
20            c++;
21            ans[k++]=v;
22            for(int i=0;i<m;i++){
23                if(prerequisites[i][1]==v){
24                    indeg[prerequisites[i][0]]--;
25                    if(indeg[prerequisites[i][0]]==0){
26                        q.add(prerequisites[i][0]);
27                    }
28
29                }
30
31            }
32        }
33        if(c!=n){
34            int[] l=new int[0];
35            return l;
36        }
37        return ans;
38    }
39}