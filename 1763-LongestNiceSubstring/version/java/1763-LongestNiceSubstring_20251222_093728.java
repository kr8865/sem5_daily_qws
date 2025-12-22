// Last updated: 22/12/2025, 09:37:28
1class Solution {
2    public String longestNiceSubstring(String s) {
3        String val="";
4        int ans=0;
5
6        for(int i=0;i<s.length();i++){
7            for(int j=i+1;j<=s.length();j++){
8                String sub=s.substring(i,j);
9                if(isGoodString(sub)){
10                    if(sub.length()>ans){
11                        ans=sub.length();
12                        val=sub;
13                    }
14                }
15            }
16        }
17        return val;
18    }
19        public static boolean isGoodString(String sub){
20          for (char c : sub.toCharArray()) {
21            if (Character.isLowerCase(c)) {
22                if (!sub.contains("" + Character.toUpperCase(c)))
23                    return false;
24            } else {
25                if (!sub.contains("" + Character.toLowerCase(c)))
26                    return false;
27            }
28        }
29        return true;
30        }
31}
32
33
34
35
36
37    