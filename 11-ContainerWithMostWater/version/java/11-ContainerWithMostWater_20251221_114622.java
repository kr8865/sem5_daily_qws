// Last updated: 21/12/2025, 11:46:22
1class Solution {
2    public int maxArea(int[] height) {
3        int lo=0;
4        int hi=height.length-1;
5        int mare=0;
6        while(lo<hi){
7            int width=hi-lo;
8            int area=width* Math.min(height[lo],height[hi]);
9            mare=Math.max(mare,area);
10            if(height[lo]>height[hi]){
11                hi--;
12            }
13            else{
14                lo++;
15            }
16
17
18        }
19       return mare; 
20    }
21}