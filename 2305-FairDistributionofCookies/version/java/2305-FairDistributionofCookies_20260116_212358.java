// Last updated: 16/01/2026, 21:23:58
1class Solution {
2    int result = Integer.MAX_VALUE;
3    int n;
4    int m;
5    public int distributeCookies(int[] cookies, int k) {
6        n = cookies.length;
7        m = k;
8        int[] child = new int[k];
9        
10        solve(cookies, child, 0);
11
12        return result;
13    }
14
15    private void solve(int[] cookies, int[] child, int i) {
16        if( i >= n) {
17            int unfairness = 0;
18            for( int tempChild : child ) {
19                if( tempChild > unfairness ) {
20                    unfairness = tempChild;
21                }
22            }
23
24            result = Math.min(result, unfairness);
25
26            return;
27        }
28
29        int cookie = cookies[i]; 
30        for( int j = 0; j < m; j++ ) {
31            child[j] += cookie;     //DO
32
33            solve(cookies, child, i + 1 );  //EXPLORE
34
35            child[j] -= cookie;     //UNDO
36
37        }
38    }
39}