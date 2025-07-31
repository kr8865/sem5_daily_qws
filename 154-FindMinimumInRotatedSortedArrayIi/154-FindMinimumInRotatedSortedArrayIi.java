// Last updated: 7/31/2025, 2:07:13 PM
class Solution {
    public int findMin(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        int ans=100000;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[lo]<nums[hi]){
                ans=Math.min(ans,nums[lo]);
                break;
                
            }
            if(nums[mid]==nums[lo] && nums[mid]==nums[hi]){
                ans=Math.min(ans,nums[mid]);

                lo++;
                hi--;
            }
            else if(nums[mid]>=nums[lo]){
                ans=Math.min(ans,nums[mid]);
                lo=mid+1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                hi=mid-1;
            }
        }
        return ans;
        
    }
}