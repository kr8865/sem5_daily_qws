// Last updated: 03/01/2026, 15:33:58
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int c=0;
4        int max=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==1){
7                c++;
8            }
9            else{
10                
11                c=0;
12                
13            }
14            max=Math.max(max,c);
15            
16        }
17        return max;
18    }
19}