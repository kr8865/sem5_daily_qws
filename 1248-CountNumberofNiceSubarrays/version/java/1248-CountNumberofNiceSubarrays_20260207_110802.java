// Last updated: 07/02/2026, 11:08:02
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        return count(nums,k)-count(nums,k-1);
4    }
5    public static int count(int[] nums,int k){
6        if(k<0){
7            return 0;
8        }
9        int l=0;
10        int r=0;
11        int c=0;
12        int odd=0;
13        while(r<nums.length){
14            if(nums[r]%2!=0){
15                odd++;
16            }
17            while(odd>k){
18                if(nums[l]%2!=0){
19                    odd--;
20                }
21                l=l+1;
22            }
23            c+=(r-l+1);
24            r+=1;
25
26
27        }
28        return c;
29    }
30}
31