// Last updated: 7/31/2025, 2:04:45 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=-1;
        int ans=-1;
       for(int i=0;i<piles.length;i++){
        if(max<piles[i]){
            max=piles[i];
        }
       }
        int lo=1;
        int hi=max;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(caneat(piles,mid,h)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
        
    }
    public static boolean caneat(int[] piles,int mid,int h){
        int c=0;
        for(int i=0;i<piles.length;i++){
            c+=Math.ceil((double)piles[i]/(double)mid);
        }
        if(c>h){
            return false;
        }
        return true;
    }
}