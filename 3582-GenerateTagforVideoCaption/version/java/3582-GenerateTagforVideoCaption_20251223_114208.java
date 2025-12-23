// Last updated: 23/12/2025, 11:42:08
1class Solution {
2    public String generateTag(String caption) {
3        boolean upper=false;
4        StringBuilder sb=new StringBuilder();
5        sb.append('#');
6        String ans=caption.trim();
7        for(int i=0;i<ans.length();i++){
8            char ch=ans.charAt(i);
9            if(ch==' '){
10                upper=true;
11            }
12            else if(upper){
13                sb.append(Character.toUpperCase(ch));
14                upper=false;
15            }
16            else if(!upper){
17                sb.append(Character.toLowerCase(ch));
18            }
19        }
20        if(sb.length()>100){
21            return sb.substring(0,100).toString();
22
23        }
24      
25        return sb.toString();
26    }
27}