// Last updated: 23/12/2025, 13:20:54
1class Solution {
2    public String pushDominoes(String dominoes) {
3        int n = dominoes.length();
4
5        int[] leftClosestR = new int[n];   // nearest R from left
6        int[] rightClosestL = new int[n];  // nearest L from right
7
8        // -------- Pass 1: Left to Right (R force) --------
9        for (int i = 0; i < n; i++) {
10            if (dominoes.charAt(i) == 'R') {
11                leftClosestR[i] = 0;   // force starts here
12            } else if (dominoes.charAt(i) == '.') {
13                if (i > 0 && leftClosestR[i - 1] != -1) {
14                    leftClosestR[i] = leftClosestR[i - 1] + 1;
15                } else {
16                    leftClosestR[i] = -1;
17                }
18            } else { // 'L'
19                leftClosestR[i] = -1;
20            }
21        }
22
23        // -------- Pass 2: Right to Left (L force) --------
24        for (int i = n - 1; i >= 0; i--) {
25            if (dominoes.charAt(i) == 'L') {
26                rightClosestL[i] = 0;  // force starts here
27            } else if (dominoes.charAt(i) == '.') {
28                if (i < n - 1 && rightClosestL[i + 1] != -1) {
29                    rightClosestL[i] = rightClosestL[i + 1] + 1;
30                } else {
31                    rightClosestL[i] = -1;
32                }
33            } else { // 'R'
34                rightClosestL[i] = -1;
35            }
36        }
37
38        // -------- Build Result --------
39        StringBuilder result = new StringBuilder();
40        for (int i = 0; i < n; i++) {
41            int r = leftClosestR[i];
42            int l = rightClosestL[i];
43
44            if (r == -1 && l == -1) result.append('.');
45            else if (r == -1) result.append('L');
46            else if (l == -1) result.append('R');
47            else if (r < l) result.append('R');
48            else if (l < r) result.append('L');
49            else result.append('.');
50        }
51
52        return result.toString();
53    }
54}
55