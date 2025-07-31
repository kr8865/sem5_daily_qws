// Last updated: 7/31/2025, 2:08:04 PM
class Solution {
    public int mySqrt(int x) {
        long lo=1;
        long hi=x;
        long ans=0;
        while(lo<=hi){
            long mid=(lo+hi)/2;
            if(mid*mid<=x){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return (int)ans;
        
    }
}