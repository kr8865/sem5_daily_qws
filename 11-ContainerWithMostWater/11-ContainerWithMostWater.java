// Last updated: 7/31/2025, 2:08:50 PM
class Solution {
    public int maxArea(int[] height) {
        int lo=0;
        int hi=height.length-1;
        int mare=0;
        while(lo<hi){
            int width=hi-lo;
            int area=width* Math.min(height[lo],height[hi]);
            mare=Math.max(mare,area);
            if(height[lo]>height[hi]){
                hi--;
            }
            else{
                lo++;
            }


        }
       return mare; 
    }
}