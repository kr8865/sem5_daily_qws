// Last updated: 21/01/2026, 11:50:31
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        if(nums1.length%2==0 && nums2.length%2==0){
4            return 0;
5        }
6        if(nums1.length%2!=0 && nums2.length%2!=0){
7            int xor=0;
8            for(int i=0;i<nums1.length;i++){
9                xor^=nums1[i];
10            }
11            for(int i=0;i<nums2.length;i++){
12                xor^=nums2[i];
13            }
14            return xor;
15        }
16        else{
17            int xor=0;
18            if(nums1.length%2==0){
19               
20                for(int i=0;i<nums1.length;i++){
21                    xor^=nums1[i];
22                }
23            }
24            else{
25              
26                for(int i=0;i<nums2.length;i++){
27                    xor^=nums2[i];
28                }
29            }
30            return xor;
31        }
32       
33    }
34}