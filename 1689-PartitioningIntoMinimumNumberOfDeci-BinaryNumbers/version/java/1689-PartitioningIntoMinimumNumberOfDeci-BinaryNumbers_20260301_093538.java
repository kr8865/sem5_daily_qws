// Last updated: 01/03/2026, 09:35:38
1class Solution {
2    public int minPartitions(String n) {
3        int max=-1000;
4        for(int i=0;i<n.length();i++){
5            int v=n.charAt(i)-'0';
6            if(v==9){
7                return 9;
8            }
9            max=Math.max(max,v);
10        }
11        return max;
12    }
13}