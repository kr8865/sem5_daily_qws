// Last updated: 7/31/2025, 2:06:25 PM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1;
        int ans=0;
        int right=n;
        while(left<=right){
            int mid=left+((right-left)/2);
            if(isBadVersion(mid)==true){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
        
    }
}