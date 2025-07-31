// Last updated: 7/31/2025, 2:05:54 PM
class Solution {
    public int splitArray(int[] nums, int k) {
        int max=-1;
        int s=0;
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            s+=nums[i];
        }
        int lo=max;
        int hi=s;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(canadd(nums,mid,k)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean canadd(int[] nums,int mid,int k){
        int l=1;
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(s+nums[i]<=mid){
                s+=nums[i];

            }
            else{
                l++;
                s=nums[i];
            }

        }
        return l<=k;
    }
}