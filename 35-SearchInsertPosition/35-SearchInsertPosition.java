// Last updated: 7/31/2025, 2:08:30 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else if(target<nums[i]){
                return i;
                
            }
        }
        return l+1;    
    }
}
