// Last updated: 06/02/2026, 11:58:31
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        if(s.length()==0){
4            return 0;
5        }
6        int l=0;
7        int r=0;
8        int maxlen=-1;
9        int[] hash=new int[256];
10        Arrays.fill(hash,-1);
11        while(r<s.length()){
12            char ch=s.charAt(r);
13            if(hash[ch]!=-1){
14               l=Math.max(l,hash[ch]+1);
15            }
16            maxlen=Math.max(maxlen,r-l+1);
17            hash[ch]=r;
18            r++;
19
20        }
21        return maxlen;
22    }
23}