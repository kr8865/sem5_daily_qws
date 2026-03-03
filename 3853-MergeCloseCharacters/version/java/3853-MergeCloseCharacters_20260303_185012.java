// Last updated: 03/03/2026, 18:50:12
1class Solution {
2    public String mergeCharacters(String s, int k) {
3        StringBuilder sb=new StringBuilder(s);
4        boolean merged=true;
5        while(merged){
6            merged=false;
7        for(int l=0;l<sb.length();l++){
8            for(int r=l+1;r<sb.length();r++){
9                if(sb.charAt(l)==sb.charAt(r) && (r-l)<=k){
10                    sb.deleteCharAt(r);
11                    merged=true;
12                    break;
13                }
14            }
15            if(merged){
16                break;
17            }
18        }
19        }
20        return sb.toString();
21    }
22}