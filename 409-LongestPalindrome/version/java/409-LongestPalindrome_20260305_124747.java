// Last updated: 05/03/2026, 12:47:47
1class Solution {
2    public int longestPalindrome(String s) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(map.containsKey(ch)){
7                int c=map.get(ch);
8                map.put(ch,c+1);
9            }
10            else{
11                map.put(ch,1);
12            }
13        }
14        int t=0;
15        boolean f=false;
16        for(char c:map.keySet()){
17            if(map.get(c)%2==0 ){
18                t+=map.get(c);
19            }
20            else if(f==false){
21                int v=map.get(c);
22                t+=v;
23                f=true;
24            }
25            else{
26                int l=map.get(c);
27                t+=(l-1);
28            }
29        }
30        return t;
31    }
32}