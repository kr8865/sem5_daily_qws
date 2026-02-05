// Last updated: 05/02/2026, 14:38:37
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int on=0;
4        int max=-1;
5        for(int i=0;i<nums.length;i++){
6           max = Math.max(max, pos(nums, i, k));
7           
8        }
9        return max;
10        
11    }
12    public static int pos(int[] nums,int i,int k){
13       int kp = 0;   // zero flips used
14        int len = 0;  // subarray length
15
16        while (i < nums.length) {
17
18            if (nums[i] == 0) {
19                if (kp == k) break;
20                kp++;
21            }
22
23            len++;
24            i++;
25        }
26
27        return len;
28            
29        
30    }
31}