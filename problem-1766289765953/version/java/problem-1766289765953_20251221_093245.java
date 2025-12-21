// Last updated: 21/12/2025, 09:32:45
1class Solution {
2    public long minCost(String s, int[] cost) {
3       Set<Character> set = new LinkedHashSet<>();
4        for(int i=0;i<s.length();i++){
5            set.add(s.charAt(i));
6            
7        }
8        List<Character> list = new ArrayList<>(set);
9       
10        long ans=Long.MAX_VALUE;
11        long total=0;
12        for (int c : cost) {
13            total += c;
14        }
15        for(int i=0;i<set.size();i++){
16            long sum=0;
17            char v=list.get(i);
18            for(int j=0;j<s.length();j++){
19                if(v==s.charAt(j)){
20                    sum+=cost[j];
21                }
22                
23            }
24            ans=Math.min(ans,total-sum);
25            
26        }
27        return ans;
28        
29    }
30}