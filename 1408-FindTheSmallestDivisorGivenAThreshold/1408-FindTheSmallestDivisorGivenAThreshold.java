// Last updated: 7/31/2025, 2:04:25 PM
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=-1;
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int lo=1;
        int hi=max;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(cando(mid,nums,threshold)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
        
    }
    public static boolean cando(int mid,int[] nums,int k){
        int c=0;
        for(int i=0;i<nums.length;i++){
            c+=Math.ceil((double)nums[i]/(double)mid);
        }
        if(c>k){
            return false;
        }
        return true;
    }

}