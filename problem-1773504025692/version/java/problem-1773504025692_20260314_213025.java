// Last updated: 14/03/2026, 21:30:25
1class Solution {
2    public int minCost(int[] nums1, int[] nums2) {
3        if(nums1.length!=nums2.length){
4            return -1;
5        }
6        
7        HashMap<Integer,Integer> map=new HashMap<>();
8        for(int i=0;i<nums1.length;i++){
9            if(map.containsKey(nums1[i])){
10                int c=map.get(nums1[i]);
11                map.put(nums1[i],c+1);
12            }
13            else{
14                map.put(nums1[i],1);
15            }
16        }
17        for(int i=0;i<nums2.length;i++){
18            if(map.containsKey(nums2[i])){
19                int c=map.get(nums2[i]);
20                map.put(nums2[i],c-1);
21                
22                
23            }
24            else{
25                map.put(nums2[i],-1);
26            }
27        }
28        int diff=0;
29        for(int v:map.keySet()){
30            if(map.get(v)%2!=0){
31                return -1;
32            }
33            diff+=Math.abs(map.get(v));
34            
35        }
36        return diff/4;
37        
38    }
39}