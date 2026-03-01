// Last updated: 01/03/2026, 09:35:07
1class Solution {
2    public int minPartitions(String n) {
3        int max=-1000;
4        for(int i=0;i<n.length();i++){
5            int v=n.charAt(i)-'0';
6            max=Math.max(max,v);
7        }
8        return max;
9    }
10}