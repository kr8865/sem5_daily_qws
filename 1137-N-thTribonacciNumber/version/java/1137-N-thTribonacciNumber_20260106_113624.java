// Last updated: 06/01/2026, 11:36:24
1class Solution {
2    public int tribonacci(int n) {
3        if(n == 0)
4            return 0;
5        if(n == 1 || n == 2)
6            return 1;
7        int[] Tribonacci = new int[n+1];
8        Tribonacci[0] = 0;
9        Tribonacci[1] = 1;
10        Tribonacci[2] = 1;
11        for(int i = 3; i < n+1; i++){
12            Tribonacci[i] = Tribonacci[i-1] + Tribonacci[i-2] + Tribonacci[i-3];
13        }
14        return Tribonacci[n];
15    }
16}