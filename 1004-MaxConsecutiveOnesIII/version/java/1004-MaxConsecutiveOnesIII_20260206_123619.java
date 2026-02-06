// Last updated: 06/02/2026, 12:36:19
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int l=0;
4        int r=0;
5        int zero=0;
6        int maxlen=-1;
7        while(r<nums.length){
8            if(nums[r]==0){
9                zero++;
10            }
11            if(zero>k){
12                if(nums[l]==0){
13                    zero--;
14                }
15                l++;
16                
17            }
18            maxlen=Math.max(maxlen,r-l+1);
19            r++;
20        }
21        return maxlen;
22    }
23}