// Last updated: 12/03/2026, 16:19:27
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int l=0;
4        int r=0;
5        int ans=0;
6        HashMap<Character,Integer> map=new HashMap<>();
7        while(r<s.length()){
8            char ch=s.charAt(r);
9            if(!map.containsKey(ch)|| map.get(ch)==0){
10                map.put(ch,1);
11            }
12            else{
13                while(map.get(ch)!=0){
14                    int c=map.get(s.charAt(l));
15                    map.put(s.charAt(l),c-1);
16                    l++;
17
18                }
19                map.put(s.charAt(r),1);
20            }
21            ans=Math.max(ans,(r-l+1));
22            r++;
23
24
25        }
26        return ans;
27    }
28}