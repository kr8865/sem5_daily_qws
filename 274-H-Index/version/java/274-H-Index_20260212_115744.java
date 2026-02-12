// Last updated: 12/02/2026, 11:57:44
1class Solution {
2    public int hIndex(int[] citations) {
3        int val=0;
4        for(int i=1;i<=citations.length;i++){
5            int ci=i;
6            int yes=0;
7            for(int j=0;j<citations.length;j++){
8                if(citations[j]>=ci){
9                    yes++;
10                    if(yes>=ci && ci>val){
11                        val=ci;
12                    }
13                }
14            }
15        }
16        
17        return val;
18    }
19}