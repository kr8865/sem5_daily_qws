// Last updated: 12/03/2026, 16:38:12
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
11            while(zero>k){
12            
13                    if(nums[l]==0){
14                        zero--;
15                    }
16                    l++;
17                
18                
19            }
20            maxlen=Math.max(maxlen,r-l+1);
21            r++;
22        }
23        return maxlen;
24    }
25}