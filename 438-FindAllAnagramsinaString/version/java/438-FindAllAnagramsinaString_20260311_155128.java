// Last updated: 11/03/2026, 15:51:28
1import java.util.*;
2
3class Solution {
4
5    static HashMap<Character,Integer> map;
6
7    public List<Integer> findAnagrams(String s, String p) {
8
9        map = new HashMap<>();
10        List<Integer> ans = new ArrayList<>();
11
12        for(char ch : p.toCharArray()){
13            map.put(ch, map.getOrDefault(ch,0)+1);
14        }
15
16        int l = 0;
17        int r = 0;
18        HashMap<Character,Integer> map2=new HashMap<>();
19
20        while(r < s.length()){
21            char ch=s.charAt(r);
22            if(map2.containsKey(ch)){
23                int c=map2.get(ch);
24                map2.put(ch,c+1);
25            }
26            else{
27                map2.put(ch,1);
28            }
29            if((r-l+1) > p.length()){
30                char left=s.charAt(l);
31            
32                map2.put(left,map2.get(left)-1);
33                if(map2.get(left)==0){
34                    map2.remove(left);
35                }
36                l++;
37                
38            }
39
40
41            if(check(map2)){
42
43                ans.add(l);
44               
45            }
46
47            r++;
48        }
49
50        return ans;
51    }
52
53    public static boolean check(HashMap<Character,Integer> map2){
54
55        return map2.equals(map);
56    }
57}