// Last updated: 12/03/2026, 16:39:26
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
12                while(zero>k){
13                    if(nums[l]==0){
14                        zero--;
15                    }
16                    l++;
17
18                }
19                
20            }
21            maxlen=Math.max(maxlen,r-l+1);
22            r++;
23        }
24        return maxlen;
25    }
26}