// Last updated: 11/03/2026, 11:52:49
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        map.put(0,1);
5        int sum=0;
6        int ans=0;
7
8        for(int j=0;j<nums.length;j++){
9            sum+=nums[j];
10            if(map.containsKey(sum-k)){
11                ans+=map.get(sum-k);
12            }
13            map.put(sum,map.getOrDefault(sum,0)+1);
14        }
15        return ans;
16        
17    }
18}