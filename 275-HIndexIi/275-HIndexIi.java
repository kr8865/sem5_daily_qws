// Last updated: 7/31/2025, 2:06:29 PM
class Solution {
    public int hIndex(int[] citations) {
        int lo=0;
        int ans=0;
        int hi=citations.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int pages=citations.length-mid;
            if(citations[mid]>=pages){
                ans=Math.max(ans,pages);
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
   
}