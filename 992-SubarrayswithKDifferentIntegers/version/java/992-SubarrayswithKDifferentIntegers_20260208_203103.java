// Last updated: 08/02/2026, 20:31:03
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        return atMost(nums,k)-atMost(nums,k-1);
4    }
5    public static int atMost(int[] nums,int k){
6        int l=0;
7        int r=0;
8        HashMap<Integer,Integer> map=new HashMap<>();
9        int count=0;
10        int tk=0;
11        while(r<nums.length){
12            
13            if(map.containsKey(nums[r])){
14                int c=map.get(nums[r]);
15                map.put(nums[r],c+1);
16                
17              
18            }
19            else{
20                map.put(nums[r],1);
21            }
22            if(map.get(nums[r])==1){
23                tk++;
24            }
25            while(tk>k){
26                int c=map.get(nums[l]);
27                map.put(nums[l],c-1);
28                if(c==1){
29                    tk--;
30                }
31                l=l+1;
32
33
34            }
35            count+=(r-l+1);
36            r+=1;
37         
38
39        }
40        return count;
41    }
42}