// Last updated: 15/02/2026, 09:37:19
1class Solution {
2    public int firstUniqueFreq(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            int v=nums[i];
6            if(map.containsKey(v)){
7                int c=map.get(v);
8                map.put(v,c+1);
9            }
10            else{
11                map.put(v,1);
12            }
13        }
14        HashMap<Integer,Integer> freq=new HashMap<>();
15        for(int value:map.values()){
16            if(freq.containsKey(value)){
17                 int cc =freq.get(value);
18                freq.put(value,cc+1);
19            }
20            else{
21                freq.put(value,1);
22            }
23        }
24        for(int va:nums){
25            int fre=map.get(va);
26            
27            if(freq.get(fre)==1){
28                return va;
29            }
30            
31        }
32        return -1;
33        
34    }
35}