// Last updated: 17/12/2025, 20:29:12
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3      HashSet<String> set=new HashSet<>(wordDict);
4      int max=0;
5      for(int i=0;i<wordDict.size();i++){
6        int v=wordDict.get(i).length();
7        if(max<v){
8            max=v;
9        }
10      }
11      boolean [] dp=new boolean[s.length()+1];
12      dp[0]=true;
13      for(int i=0;i<dp.length;i++){
14        for(int j=i-1;j>=Math.max(0,i-max);j--){
15            if(dp[j]&& set.contains(s.substring(j,i))){
16                dp[i]=true;
17                break;
18            }
19        }
20      }
21      return dp[dp.length-1];
22    }
23}