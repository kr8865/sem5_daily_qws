// Last updated: 14/01/2026, 11:40:09
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n<=0){
4            return false;
5        }
6        int p=Math.abs(n);
7        return (p&(p-1))==0;
8    }
9}