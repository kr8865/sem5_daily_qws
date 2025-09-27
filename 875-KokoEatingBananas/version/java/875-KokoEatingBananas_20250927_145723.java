// Last updated: 9/27/2025, 2:57:23 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int lo=1;
        int ans=0;
        int hi=piles[piles.length-1];
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(caneat(mid,piles,h)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean caneat(int k,int[] piles,int h){
        int time=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]<=k){
                time+=1;
                
            }
            else{
                time+=Math.ceil((double)piles[i]/(double)k);
            }
            

        }
        return time<=h;
    }
}