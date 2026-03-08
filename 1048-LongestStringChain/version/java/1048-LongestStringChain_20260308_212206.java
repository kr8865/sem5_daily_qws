// Last updated: 08/03/2026, 21:22:06
1class Solution {
2
3    public int longestStrChain(String[] words) {
4        int n = words.length;
5        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
6
7        int[] t = new int[n];
8        Arrays.fill(t, 1);
9        int maxL = 1;
10
11        for (int i = 0; i < n; i++) {
12            for (int j = 0; j < i; j++) {
13
14                if (predecessor(words[j], words[i])) {
15                    t[i] = Math.max(t[i], t[j] + 1);
16                    maxL = Math.max(maxL, t[i]);
17                }
18            }
19        }
20
21        return maxL;
22    }
23        
24    public boolean predecessor(String prev, String curr) {
25        int M = prev.length();
26        int N = curr.length();
27
28        if (M >= N || N - M != 1)
29            return false;
30
31        int i = 0, j = 0;
32        while (i < M && j < N) {
33            if (prev.charAt(i) == curr.charAt(j)) {
34                i++;
35            }
36            j++;
37        }
38        return i == M;
39    }
40
41}