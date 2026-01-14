// Last updated: 14/01/2026, 12:15:00
1class Solution {
2    public int[] singleNumber(int[] nums) {
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
13        int c=0;
14        int k=0;
15        int[] ans=new int[2];
16        for(int i:map.keySet()){
17           int v= map.get(i);
18           if(v==1 && c<2){
19            ans[k]=i;
20            c++;
21            k++;
22           }
23        }
24        return ans;
25    }
26}