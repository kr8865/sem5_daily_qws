// Last updated: 7/31/2025, 2:04:34 PM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=-1;
        int s=0;
        int ans=-1;
        for(int i=0;i<weights.length;i++){
            if(max<weights[i]){
                max=weights[i];
            }
            s+=weights[i];
        }
        int lo=max;
        int hi=s;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(canplace(weights,mid,days)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
        
    }
    public static boolean canplace(int[] arr,int mid,int days){
        int d=1;
        int load=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+load>mid){
                load=arr[i];
                d++;

            }
            else{
                load+=arr[i];
            }
        }
        if(d>days){
            return false;
        }
        return true;
    }
}