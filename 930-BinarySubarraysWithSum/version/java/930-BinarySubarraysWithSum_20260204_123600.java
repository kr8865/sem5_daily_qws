// Last updated: 04/02/2026, 12:36:00
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        int count=0;
4        for(int i=0;i<nums.length;i++){
5            int sum=0;
6            for(int j=i;j<nums.length;j++){
7                sum+=nums[j];
8                if(sum==goal){
9                    count++;
10                }
11
12            }
13        }
14        return count;
15    }
16}