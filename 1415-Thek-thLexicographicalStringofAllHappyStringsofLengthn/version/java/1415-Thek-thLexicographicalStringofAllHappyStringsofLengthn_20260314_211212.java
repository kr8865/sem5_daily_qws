// Last updated: 14/03/2026, 21:12:12
1class Solution {
2
3    static int count = 0;
4    static String curr = "";
5
6    public String getHappyString(int n, int k) {
7        count = 0;
8        curr = "";
9        solve(n, '#', 0, "", k);
10        return curr;
11    }
12
13    public static void solve(int n, char prev, int size, String ans, int k) {
14
15        if(size == n){
16            count++;
17
18            if(count == k){
19                curr = ans;
20            }
21            return;
22        }
23
24        char[] chars = {'a','b','c'};
25
26        for(int i = 0; i < chars.length; i++){
27
28            if(prev != chars[i]){
29
30                solve(n, chars[i], size + 1, ans + chars[i], k);
31
32                if(curr.length() > 0) return; // stop recursion early
33            }
34        }
35    }
36}