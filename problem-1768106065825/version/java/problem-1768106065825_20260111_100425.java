// Last updated: 11/01/2026, 10:04:25
1class Solution {
2    public int residuePrefixes(String s) {
3        int c=0;
4        for(int i=0;i<s.length();i++){
5           HashSet<Character> set=new HashSet<>();
6            for(int j=0;j<=i;j++){
7                char ch=s.charAt(j);
8                set.add(ch);
9            }
10            int len=i+1;
11            if(len%3==set.size()){
12                c++;
13            }
14        }
15        return c;
16    }
17}