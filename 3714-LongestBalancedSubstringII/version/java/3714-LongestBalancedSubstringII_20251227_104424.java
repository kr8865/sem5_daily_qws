// Last updated: 27/12/2025, 10:44:24
1
2class Solution {
3    public int longestBalanced(String s) {
4        int n = s.length();
5        int maxAns = 0;
6
7        // solving case a b c all are present 
8        Map<Pair<Integer, Integer>, Integer> map = new HashMap<>();
9
10        map.put(new Pair<Integer, Integer>(0, 0), -1);
11
12        int v1 = 0; // ab,
13        int v2 = 0; // cb
14        for (int j = 0; j < n; j++) {
15            char ch = s.charAt(j);
16            if (ch == 'a')
17                v1++;
18            else if (ch == 'c')
19                v2++;
20            else {
21                v1--;
22                v2--;
23            }
24            maxAns = Math.max(maxAns, j - map.getOrDefault(new Pair<Integer, Integer>(v1, v2), j));
25            map.putIfAbsent(new Pair<Integer, Integer>(v1, v2), j);
26        }
27
28        // System.out.println("ans = " + maxAns);
29
30        String arr[] = { "ab", "ac", "bc" };
31        for (String key : arr) {
32            int res = searchLongestSubstring(s, key);
33            maxAns = Math.max(maxAns, res);
34            // System.out.println("ans = " + maxAns + " res = " + res);
35        }
36        // System.out.println("ans = " + maxAns);
37
38        int count = 1;
39        for (int i = 1; i < n; i++) {
40            if (s.charAt(i - 1) == s.charAt(i))
41                count++;
42            else {
43                maxAns = Math.max(maxAns, count);
44                count = 1;
45            }
46        }
47        maxAns = Math.max(maxAns, count);
48
49        return maxAns;
50    }
51
52    public int searchLongestSubstring(String s, String search) {
53        int n = s.length();
54        int max = 0;
55
56        for (int i = 0; i < n; i++) {
57            int j = i; // start of the substring;
58            Map<Integer, Integer> map = new HashMap<>();
59            int count = 0;
60            map.put(count, i - 1);
61
62            while (j < n && match(search, s.charAt(j))) {
63                count += s.charAt(j) == search.charAt(0) ? 1 : -1;
64
65                if (map.containsKey(count)) {
66                    // System.out.println("count = " + count + ", j = " + j);
67                    max = Math.max(max, j - map.get(count));
68                } else {
69                    map.put(count, j);
70                }
71                j++;
72            }
73            i = j; // j is pointing to the next index and also for loop will increse that's why decreases by one
74        }
75        return max;
76    }
77
78    public boolean match(String search, char t) {
79
80        for (char ch : search.toCharArray()) {
81            if (ch == t) {
82                return true;
83            }
84        }
85        return false;
86    }
87}