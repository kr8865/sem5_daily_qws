// Last updated: 13/03/2026, 16:36:29
1class Solution {
2    public int characterReplacement(String s, int k) {
3       int l=0;
4       int r=0;
5       int ans=0;
6       int maxFreq=0;
7       HashMap<Character,Integer> map=new HashMap<>();
8       while(r<s.length()){
9        char ch=s.charAt(r);
10        if(map.containsKey(ch)){
11            int c=map.get(ch);
12            map.put(ch,c+1);
13        }
14        else{
15            map.put(ch,1);
16        }
17        maxFreq = Math.max(maxFreq, map.get(ch));
18        if((r - l + 1) - maxFreq > k){
19            while((r - l + 1) - maxFreq > k){
20                char v=s.charAt(l);
21                map.put(v,map.get(v)-1);
22                if(map.get(v)==0){
23                    map.remove(v);
24                }
25                l++;
26                
27            }
28        }
29        ans=Math.max(ans,r-l+1);
30        r++;
31
32       }
33       return ans;
34    }
35}