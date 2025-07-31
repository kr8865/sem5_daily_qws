// Last updated: 7/31/2025, 2:04:49 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int lo=0;
      int max=Integer.MIN_VALUE;
      int ans=0;
      int hi=arr.length-1;
      while(lo<=hi){
        int mid=(lo+hi)/2;
        if(arr[mid]>arr[mid+1]){
            ans=mid;
            hi=mid-1;
        }
        else{
            lo=mid+1;
        }
      }
      return ans;
    }
}