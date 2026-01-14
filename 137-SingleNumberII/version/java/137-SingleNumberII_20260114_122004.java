// Last updated: 14/01/2026, 12:20:04
1class Solution {
2    public int singleNumber(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            if(map.containsKey(nums[i])){
6                int c=map.get(nums[i]);
7                map.put(nums[i],c+1);
8            }
9            else{
10                map.put(nums[i],1);
11            }
12        }
13        for(int i:map.keySet()){
14            if(map.get(i)<3){
15                return i;
16            }
17        }
18        return -1;
19    }
20}