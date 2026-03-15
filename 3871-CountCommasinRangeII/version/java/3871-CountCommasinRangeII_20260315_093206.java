// Last updated: 3/15/2026, 9:32:06 AM
1class Solution {
2    public long countCommas(long n) {
3         long c=0;
4        long start=1000;
5        long cc=1;
6        while(start<=n){
7            long g=Math.min(n,start*1000-1);
8            c+=(g-start+1)*cc;
9            start*=1000;
10            cc++;
11        }
12        return c;
13        
14    }
15}