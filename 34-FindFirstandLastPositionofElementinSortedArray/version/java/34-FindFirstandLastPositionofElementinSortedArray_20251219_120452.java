// Last updated: 19/12/2025, 12:04:52
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int si=startp(nums,target);
4        int ei=lastp(nums,target);
5        
6        int[] arr={si,ei};
7        return arr;
8        
9    }
10    public int startp(int[] nums,int target){
11        int lo=0;
12        int hi=nums.length-1;
13        int ans=-1;
14        while(lo<=hi){
15            int mid=(lo+hi)/2;
16            if(nums[mid]==target){
17                ans=mid;
18                hi=mid-1;
19            }
20            else if(target>nums[mid]){
21                lo=mid+1;
22            }
23            else{
24                hi=mid-1;
25            }
26
27        }
28        return ans;
29
30
31    }
32    public int lastp(int[] nums,int target){
33        int lo=0;
34        int ans=-1;
35        int hi=nums.length-1;
36        while(lo<=hi){
37            int mid=(lo+hi)/2;
38            if(nums[mid]==target){
39                ans=mid;
40                lo=mid+1;
41            }
42            else if(nums[mid]>target){
43                hi=mid-1;
44            }
45            else{
46                lo=mid+1;
47            }
48        }
49        return ans;
50    }
51}