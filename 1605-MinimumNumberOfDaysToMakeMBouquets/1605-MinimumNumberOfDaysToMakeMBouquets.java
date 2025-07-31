// Last updated: 7/31/2025, 2:04:13 PM
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max=-1;
        for(int i=0;i<bloomDay.length;i++){
            if(max<bloomDay[i]){
                max=bloomDay[i];
            }
        }
        int lo=1;
        int ans=-1;
        int hi=max;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(canbloom(bloomDay,mid,m,k)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
        
    }
    public static boolean canbloom(int[] arr,int mid,int m,int k){
        int f=0;
        int bq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                f++;
                if(f==k){
                bq++;
                f=0;
            }
            }
            
            else{
                f=0;
            }
        }
        if(bq>=m){
            return true;
        }
        return false;
    }
}