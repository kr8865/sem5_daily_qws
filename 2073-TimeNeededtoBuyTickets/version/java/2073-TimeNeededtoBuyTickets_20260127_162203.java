// Last updated: 27/01/2026, 16:22:03
1class Solution {
2    class Pair{
3        int tic;
4        int idx;
5        Pair(int tic,int idx){
6            this.tic=tic;
7            this.idx=idx;
8        }
9    }
10    public int timeRequiredToBuy(int[] tickets, int k) {
11        Queue<Pair> q=new LinkedList<>();
12        for(int i=0;i<tickets.length;i++){
13            q.add(new Pair(tickets[i],i));
14        }
15        int c=0;
16        while(!q.isEmpty()){
17            int tic=q.peek().tic;
18            int id=q.peek().idx;
19            tic=tic-1;
20            c++;
21            q.poll();
22            if(id==k){
23                if(tic==0){
24                    return c;
25                }
26                else{
27                    q.add(new Pair(tic,id));
28                }
29            }
30            else{
31                if(tic!=0){
32                    q.add(new Pair(tic,id));
33                   
34                }
35            }
36        }
37        return c;
38
39    }
40}