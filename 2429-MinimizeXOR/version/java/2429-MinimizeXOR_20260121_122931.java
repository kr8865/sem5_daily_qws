// Last updated: 21/01/2026, 12:29:31
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3        int a = Integer.bitCount(num1);
4        int b = Integer.bitCount(num2);
5        int res = num1;
6        for (int i = 0; i < 32; i++) {
7            if (a > b && ((1 << i) & num1) > 0) {
8                res ^= 1 << i;
9                a--;
10            }
11            if (a < b && ((1 << i) & num1) == 0) {
12                res ^= 1 << i;
13                a++;
14            }
15        }
16        return res;
17    }
18}