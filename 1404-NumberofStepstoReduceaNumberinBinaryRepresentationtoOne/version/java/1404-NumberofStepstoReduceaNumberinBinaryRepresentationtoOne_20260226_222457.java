// Last updated: 26/02/2026, 22:24:57
1class Solution {
2    public int numSteps(String s) {
3        
4        int so = 0;
5        int c= 0;
6        int n= s.length() - 1;
7
8        for (int i =n; i > 0; i--) {
9            int bit = (s.charAt(i) - '0') + c;
10
11            if (bit == 1) {
12                so += 2;   
13                c = 1;
14            } else {
15                so += 1;   // just divide
16            }
17        }
18
19        return so + c;
20
21        
22    }
23}