// Last updated: 3/15/2026, 9:30:48 AM
1class Solution {
2    public int countCommas(int n) {
3        if(n<1000){
4            return 0;
5        }
6        return (n-1000+1);
7    }
8}