// Last updated: 9/19/2025, 8:51:20 PM
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int lo=0;
        int ans=0;
        Arrays.sort(houses);
Arrays.sort(heaters);
        int hi = Math.max(houses[houses.length-1], heaters[heaters.length-1]);
        while(lo<=hi){
            int mid = lo + (hi - lo) / 2;
            if(canHeat(houses,heaters,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
        
    }
    public static boolean canHeat(int[] houses,int[] heaters,int radius){
       
        int k=0;
        for(int i=0;i<houses.length  ;i++){
            while( k<heaters.length && Math.abs(houses[i]-heaters[k])>radius){
                k++;
            
            }
            if(k==heaters.length){
                return false;
            }
        }
        
        return true;
    }
}