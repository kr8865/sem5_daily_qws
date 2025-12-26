// Last updated: 26/12/2025, 11:57:20
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        int i=0;
4        int j=0;
5        while(i<nums1.length && j<nums2.length){
6            if(nums1[i]==nums2[j]){
7                return nums1[i];
8            }
9            if(nums1[i]>nums2[j]){
10                j++;
11
12            }
13            else{
14                i++;
15
16            }
17        }
18        return -1;
19    }
20}