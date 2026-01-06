// Last updated: 06/01/2026, 11:37:31
1class Solution {
2    public int minimumNumbers(int num, int k) {
3        if (num == 0) return 0;
4        for (int i = 1; i * k <= num && i <= 10; ++i)
5            if (k * i % 10 == num % 10)
6                return i;
7        return -1;
8    }
9}