// Last updated: 17/01/2026, 09:57:53
1class Solution {
2    public boolean canPartitionKSubsets(int[] nums, int k) {
3        Arrays.sort(nums);
4        reverse(nums);
5        int sum=0;
6        for(int i=0;i<nums.length;i++){
7            sum+=nums[i];
8        }
9        if(sum%k!=0){
10            return false;
11        }
12        int ts=sum/k;
13        int[] ans=new int[k];
14        return find(nums,k,ans,0,ts);
15    }
16    public static boolean find(int[] nums,int k,int[] ans,int idx,int ts){
17
18        if(idx==nums.length){
19            for(int i=0;i<k;i++){
20                if(ans[i]!=ts){
21                    return false;
22                }
23            }
24            return true;
25
26        }
27        for(int i=0;i<k;i++){
28            if(ans[i]+nums[idx]<=ts){
29                ans[i]+=nums[idx];
30                boolean b=find(nums,k,ans,idx+1,ts);
31                if(b){
32                    return true;
33                }
34                ans[i]-=nums[idx];
35            }
36            if (ans[i] == 0) break;
37        }
38        return false;
39    }
40    private void reverse(int[] nums) {
41        int l = 0, r = nums.length - 1;
42        while (l < r) {
43            int t = nums[l];
44            nums[l] = nums[r];
45            nums[r] = t;
46            l++; r--;
47        }
48    }
49}