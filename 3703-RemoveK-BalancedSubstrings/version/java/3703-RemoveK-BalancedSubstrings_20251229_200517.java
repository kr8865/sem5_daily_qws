// Last updated: 29/12/2025, 20:05:17
1class Solution {
2    public String removeSubstring(String s, int k) {
3        StringBuilder ans = new StringBuilder(s);
4        StringBuilder patternBuilder = new StringBuilder();
5        for (int i = 0; i < k; i++) {
6            patternBuilder.append('(');
7        }
8        for (int i = 0; i < k; i++) {
9            patternBuilder.append(')');
10        }
11        String pattern = patternBuilder.toString();
12        if(pattern.length() == 0) return s;
13
14        int i = 0;
15        while(i<=ans.length()-2*k){
16            if(ans.substring(i,i+2*k).equals(pattern)){
17                ans.delete(i,i+2*k);
18                i = Math.max(0,i-2*k);
19            }
20            else i++;
21        }
22        return ans.toString();
23    }
24}