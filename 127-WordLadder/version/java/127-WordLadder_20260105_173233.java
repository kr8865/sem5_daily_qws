// Last updated: 05/01/2026, 17:32:33
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        if(!wordList.contains(endWord)) return 0;
4        Queue<Pair> q = new LinkedList<>();
5        q.add(new Pair(beginWord,1));
6
7        HashSet<String> set = new HashSet<>();
8        int len = wordList.size();
9        for(int i=0; i<len; i++){
10            set.add(wordList.get(i));
11        }
12       
13
14        while(!q.isEmpty()){
15            String st = q.peek().word;
16            int steps = q.peek().level;
17
18            q.remove();
19
20            if(st.equals(endWord)) return steps;
21
22            for(int i=0; i<st.length(); i++){
23                for(char ch='a'; ch<='z'; ch++){
24                    char[] replacedArray = st.toCharArray();
25                    replacedArray[i] = ch;
26                    String replacedWord = new String(replacedArray);
27                    if(set.contains(replacedWord)){
28                        set.remove(replacedWord);
29                        q.add(new Pair(replacedWord,steps+1));
30                    }
31                }
32            }
33        }
34        return 0;
35    }
36    class Pair{
37        String word;
38        int level;
39        Pair(String word, int level){
40            this.word = word;
41            this.level = level;
42        }
43    }
44}