// Last updated: 09/02/2026, 12:36:38
1class Solution {
2    static HashMap<Character, Integer> need = new HashMap<>();
3
4    public String minWindow(String s, String t) {
5        if (s.length() < t.length()) return "";
6
7        // build need map once
8        need.clear();
9        for (char c : t.toCharArray()) {
10            need.put(c, need.getOrDefault(c, 0) + 1);
11        }
12
13        int l = 0, r = 0;
14        int minLen = Integer.MAX_VALUE;
15        int minL = 0, minR = 0;
16
17        HashMap<Character, Integer> map = new HashMap<>();
18
19        while (r < s.length()) {
20            char ch = s.charAt(r);
21            map.put(ch, map.getOrDefault(ch, 0) + 1);
22
23            while (valid(map)) {
24                // save answer BEFORE shrinking
25                if (r - l + 1 < minLen) {
26                    minLen = r - l + 1;
27                    minL = l;
28                    minR = r;
29                }
30
31                char leftChar = s.charAt(l);
32                map.put(leftChar, map.get(leftChar) - 1);
33                l++;
34            }
35            r++;
36        }
37
38        return minLen == Integer.MAX_VALUE ? "" 
39               : s.substring(minL, minR + 1);
40    }
41
42    // corrected validation
43    public static boolean valid(HashMap<Character, Integer> window) {
44        for (char c : need.keySet()) {
45            if (window.getOrDefault(c, 0) < need.get(c)) {
46                return false;
47            }
48        }
49        return true;
50    }
51}
52