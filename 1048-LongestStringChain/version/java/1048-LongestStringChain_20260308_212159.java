// Last updated: 08/03/2026, 21:21:59
1class Solution {
2    int n;
3    int[][] t = new int[1001][1001];
4
5    boolean predecessor(String prev, String curr) {
6        int M = prev.length();
7        int N = curr.length();
8
9        if (M >= N || N - M != 1)
10            return false;
11
12        int i = 0, j = 0;
13        while (i < M && j < N) {
14            if (prev.charAt(i) == curr.charAt(j)) {
15                i++;
16            }
17            j++;
18        }
19        return i == M;
20    }
21
22    int lis(String[] words, int prevIdx, int currIdx) {
23        if (currIdx == n)
24            return 0;
25
26        if (prevIdx != -1 && t[prevIdx][currIdx] != -1)
27            return t[prevIdx][currIdx];
28
29        int taken = 0;
30        if (prevIdx == -1 || predecessor(words[prevIdx], words[currIdx]))
31            taken = 1 + lis(words, currIdx, currIdx + 1);
32
33        int notTaken = lis(words, prevIdx, currIdx + 1);
34
35        if (prevIdx != -1)
36        t[prevIdx][currIdx] = Math.max(taken, notTaken);
37
38        return Math.max(taken, notTaken);
39    }
40
41    int longestStrChain(String[] words) {
42        for(int i = 0; i < 1000; i++) {
43            for(int j = 0; j < 1000; j++) {
44                t[i][j] = -1;
45            }
46        }
47        
48        n = words.length;
49        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length())); // You can select pairs in any order.
50        return lis(words, -1, 0);
51    }
52}