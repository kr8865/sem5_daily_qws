// Last updated: 21/12/2025, 11:40:32
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3
4        StringBuilder sb = new StringBuilder();
5        int count = 0;
6
7        // Keep repeating until length >= b
8        while (sb.length() < b.length()) {
9            sb.append(a);
10            count++;
11        }
12
13        // Check if b is substring
14        if (sb.indexOf(b) != -1) {
15            return count;
16        }
17
18        // Check one more repetition for overlap case
19        sb.append(a);
20        count++;
21
22        if (sb.indexOf(b) != -1) {
23            return count;
24        }
25
26        // If still not found
27        return -1;
28    }
29}
30