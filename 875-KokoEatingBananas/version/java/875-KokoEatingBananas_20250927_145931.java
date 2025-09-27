// Last updated: 9/27/2025, 2:59:31 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=-1;
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]){
                max=piles[i];
            }
        }
        int lo=1;
        int ans=0;
        int hi=max;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
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