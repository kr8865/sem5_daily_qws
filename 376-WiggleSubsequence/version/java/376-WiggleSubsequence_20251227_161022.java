// Last updated: 27/12/2025, 16:10:22
1class Solution {
2    public int wiggleMaxLength(int[] nums) {
3        if(nums.length == 1) return 1; // if length is one answer will be one
4        int prevSign = nums[1] - nums[0]; 
5        int length = prevSign != 0 ? 2:1;// if we have some difference other than 0 
6		//then 1st and 2nd are a part of the sequence therefore length will be 2 otherwise element at 0th or 1st index will alone make a sequence
7        for(int i=2;i<nums.length;i++){ //starting with 2nd index 
8            int currSign = nums[i] - nums[i-1]; 
9            if((currSign > 0 && prevSign <= 0) || (currSign < 0 && prevSign >= 0)){ // if any of the two conditions that the wiggle sequence asks 
10			// the equals in prevSign <= 0 && prevSign >=0 can only be used at the first iteration, otherwise prevSign will never be zero afterwards 
11                length++; // increase the length 
12                prevSign = currSign; // maintaining the prev sign
13            }else{
14                // not considering the elements or simply removing them from the sequence
15            }
16        }
17        return length;
18    }
19}