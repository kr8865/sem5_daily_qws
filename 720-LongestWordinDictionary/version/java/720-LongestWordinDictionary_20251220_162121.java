// Last updated: 20/12/2025, 16:21:21
1import java.util.*;
2
3class Solution {
4    public String longestWord(String[] words) {
5        // Sort by length, then lexicographically
6        Arrays.sort(words, (a, b) -> {
7            if (a.length() == b.length()) {
8                return a.compareTo(b);
9            }
10            return a.length() - b.length();
11        });
12
13        HashSet<String> built = new HashSet<>();
14        String result = "";
15
16        for (String word : words) {
17            // If single character OR prefix exists
18            if (word.length() == 1 || built.contains(word.substring(0, word.length() - 1))) {
19                built.add(word);
20
21                // Update result if longer or lexicographically smaller
22                if (word.length() > result.length() ||
23                    (word.length() == result.length() && word.compareTo(result) < 0)) {
24                    result = word;
25                }
26            }
27        }
28
29        return result;
30    }
31}
32