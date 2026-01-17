// Last updated: 17/01/2026, 10:23:08
1class Solution {
2    public boolean findSubarrays(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<=nums.length-2;i++){
5            int sum=0;
6            for(int j=i+1;j<i+2;j++){
7                sum=nums[i]+nums[j];
8                if(map.containsKey(sum)){
9                    return true;
10                }
11                else{
12                    map.put(sum,1);
13                }
14            }
15        }
16        return false;
17    }
18}