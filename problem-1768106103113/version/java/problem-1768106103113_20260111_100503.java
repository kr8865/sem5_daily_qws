// Last updated: 11/01/2026, 10:05:03
1class Solution {
2    public long countPairs(String[] words) {
3        HashMap<String, Integer> map = new HashMap<>();
4        long c = 0;
5
6        for (int i = 0; i < words.length; i++) {
7            String str = words[i];
8            String key =isCheck(str);
9
10            map.put(key, map.getOrDefault(key, 0) + 1);
11        }
12
13        for (int val : map.values()) {
14            c += (long) val * (val - 1) / 2;
15        }
16
17        return c;
18    }
19
20    public static String isCheck(String word) {
21        int d= word.charAt(0) - 'a';
22        StringBuilder ans = new StringBuilder();
23
24        for (int i = 0; i < word.length(); i++) {
25            int ch = (word.charAt(i) - 'a' - d + 26) % 26;
26            ans.append((char) ('a' + ch));
27        }
28        return ans.toString();
29    }
30}