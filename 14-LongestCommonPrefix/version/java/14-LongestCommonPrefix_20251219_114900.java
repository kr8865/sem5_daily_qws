// Last updated: 19/12/2025, 11:49:00
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3         String prefix=strs[0];
4         for(int i=1;i<strs.length;i++){
5            String ans="";
6            int l=Math.min(strs[i].length() ,prefix.length());
7            for(int j=0;j<l;j++){
8                if(prefix.charAt(j)==strs[i].charAt(j)){
9                    ans+=strs[i].charAt(j);
10
11                }
12                else{
13                    break;
14                }
15            }
16            prefix=ans;
17         }
18         return prefix;
19    }
20}