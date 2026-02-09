// Last updated: 09/02/2026, 12:40:18
1class Solution {
2    static HashMap<Character, Integer> need = new HashMap<>();
3    public String minWindow(String s, String t) {
4          if (s.length() < t.length()) return "";
5
6        need.clear(); // 🔥 IMPORTANT FIX
7
8        for (char c : t.toCharArray()) {
9            need.put(c, need.getOrDefault(c, 0) + 1);
10        }
11        int l=0;
12        int r=0;
13        int minl=0;
14        int minr=0;
15
16        int len=Integer.MAX_VALUE;
17        HashMap<Character,Integer> map=new HashMap<>();
18        while(r<s.length()){
19            char ch=s.charAt(r);
20            if(map.containsKey(ch)){
21                int v=map.get(ch);
22                map.put(ch,v+1);
23            }
24            else{
25                map.put(ch,1);
26            }
27            while(valid(map)){
28                
29                if(len>(r-l+1)){
30                    minl=l;
31                    minr=r;
32                    len=Math.min(len,(r-l+1));
33                }
34                int c=map.get(s.charAt(l));
35                map.put(s.charAt(l),c-1);
36                l=l+1;
37        
38            }
39            r++;
40
41        }
42        return len == Integer.MAX_VALUE ? "" 
43               : s.substring(minl, minr + 1);
44        
45    }
46    public static boolean valid(HashMap<Character,Integer> map){
47       
48       for (char c : need.keySet()) {
49            if (map.getOrDefault(c, 0) < need.get(c)) {
50                return false;
51            }
52        }
53        return true;
54    }
55}