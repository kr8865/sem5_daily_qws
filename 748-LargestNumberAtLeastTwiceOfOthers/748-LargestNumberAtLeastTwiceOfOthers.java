// Last updated: 7/31/2025, 2:05:01 PM
class Solution {
    public int dominantIndex(int[] nums) {
        int max=-111;
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                idx=i;
            }
        }
        int n=max;
        int ans=idx;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>n/2 && i!=idx){
                ans=-1;
                break;
            }
            

        }
        return ans;
    }
}