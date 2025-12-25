// Last updated: 25/12/2025, 11:31:15
1class Solution {
2    public int distMoney(int money, int children) {
3        money -= children;
4    if (money < 0)
5        return -1;
6    if (money / 7 == children && money % 7 == 0)
7        return children;
8    if (money / 7 == children - 1 && money % 7 == 3)
9        return children - 2;
10    return Math.min(children - 1, money / 7);
11        
12    }
13}