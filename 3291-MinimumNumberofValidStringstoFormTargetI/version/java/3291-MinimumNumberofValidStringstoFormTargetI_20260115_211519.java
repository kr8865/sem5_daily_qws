// Last updated: 15/01/2026, 21:15:19
1public class Solution {
2    public int minValidStrings(String[] words, String target) {
3        Trie trie = new Trie();
4        for (String word : words) {
5            trie.add(word);
6        }
7        int count = 0;
8        int index = 0;
9        while (index < target.length()) {
10            count++;
11            int maxLength = trie.getMaxPrefixLength(target, index);
12            int bestSum = index + maxLength;
13            if (bestSum == target.length()) {
14                break;
15            }
16            int bestLength = 0;
17            for (int prefix = 1; prefix <= maxLength; prefix++) {
18                int nextLength = trie.getMaxPrefixLength(target, index + prefix);
19                if (index + prefix + nextLength >= bestSum) {
20                    bestSum = index + prefix + nextLength;
21                    bestLength = prefix;
22                }
23            }
24            if (bestLength == 0) {
25                return -1;
26            }
27            index += bestLength;
28        }
29        return count;
30    }
31
32    static class Trie {
33        private final TrieNode root;
34
35        public Trie() {
36            this.root = new TrieNode('\0');
37        }
38
39        public void add(String word) {
40            TrieNode current = root;
41            for (int i = 0; i < word.length(); i++) {
42                char ch = word.charAt(i);
43                if (current.letters[ch - 'a'] == null) {
44                    current.letters[ch - 'a'] = new TrieNode(ch);
45                }
46                current = current.letters[ch - 'a'];
47            }
48        }
49
50        public int getMaxPrefixLength(String word, int start) {
51            TrieNode current = root;
52            int length = 0;
53            for (int i = start; i < word.length(); i++) {
54                char ch = word.charAt(i);
55                if (current.letters[ch - 'a'] == null) {
56                    break;
57                }
58                current = current.letters[ch - 'a'];
59                length++;
60            }
61            return length;
62        }
63
64        static class TrieNode {
65            char value;
66            TrieNode[] letters;
67
68            public TrieNode(char value) {
69                this.value = value;
70                this.letters = new TrieNode[26];
71            }
72        }
73    }
74}