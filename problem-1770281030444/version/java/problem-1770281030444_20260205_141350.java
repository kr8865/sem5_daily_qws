// Last updated: 05/02/2026, 14:13:50
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        if(s.length()==0){
4            return 0;
5        }
6        int max=-1;
7        for(int i=0;i<s.length();i++){
8            HashMap<Character,Integer> map=new HashMap<>();
9            for(int j=i;j<s.length();j++){
10                char ch=s.charAt(j);
11                if(map.containsKey(ch)){
12                    break;
13                }
14                else{
15                    max=Math.max(max,j-i+1);
16                    map.put(ch,1);
17                }
18                
19
20            }
21        }
22        return max;
23    }
24}