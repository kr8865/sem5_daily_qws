// Last updated: 19/12/2025, 13:22:05
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int mid=nums1.length+nums2.length;
4        int[] finala=merge(nums1,nums2);
5        if(mid%2!=0){
6            int f=mid/2;
7            return (double)finala[f];
8        }
9        else{
10            int f=mid/2;
11
12            return (double)((finala[f-1]+finala[f])/2.0);
13        }
14    }
15    public static int[] merge(int[] nums1,int[] nums2){
16        int[] finala=new int[nums1.length+nums2.length];
17        int i=0;
18        int j=0;
19        int k=0;
20        while(i<nums1.length && j<nums2.length){
21            if(nums1[i]<nums2[j]){
22                finala[k]=nums1[i];
23                k++;
24                i++;
25            }
26            else{
27                finala[k]=nums2[j];
28                k++;
29                j++;
30            }
31        }
32        while(i<nums1.length){
33            finala[k]=nums1[i];
34            i++;
35            k++;
36        }
37        while(j<nums2.length){
38            finala[k]=nums2[j];
39            j++;
40            k++;
41        }
42        return finala;
43    }
44}