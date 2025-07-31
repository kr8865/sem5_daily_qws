// Last updated: 7/31/2025, 2:08:11 PM
class Solution {
    public boolean canJump(int[] nums) {
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;            }
            max=Math.max(max,i+nums[i]);

        }
        
    return true;
    }
}