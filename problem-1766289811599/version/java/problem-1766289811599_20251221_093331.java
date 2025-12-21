// Last updated: 21/12/2025, 09:33:31
1class Solution {
2    public int mirrorDistance(int n) {
3        int f=n;
4        int num=0;
5        while(n>0){
6            int d=n%10;
7            n=n/10;
8            num=num*10+d;
9         
10        }
11        return Math.abs(f-num);
12        
13    }
14}