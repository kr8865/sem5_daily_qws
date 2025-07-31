// Last updated: 7/31/2025, 2:05:49 PM
class Solution {
    public int arrangeCoins(int n) {
        long left=1;
        long ans=0;
        long right=n;
        long mid=0;
        while(left<=right){
            mid= (left+(right-mid)/2);
            long sum=mid*(mid+1)/2;
            if(sum<=n){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return (int)ans;
    }
}