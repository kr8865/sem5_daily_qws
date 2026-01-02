// Last updated: 02/01/2026, 11:42:08
1class Solution {
2    public int minPatches(int[] nums, int n) {
3        long max_reach=0;
4        int patch=0;
5        int i=0;
6        while(max_reach<n){
7            if(i<nums.length && nums[i]<=max_reach+1){
8                max_reach+=nums[i];
9                i++;
10            }
11            else{
12                max_reach+=(max_reach+1);
13                patch++;
14            }
15        }
16        return patch;
17    }
18}