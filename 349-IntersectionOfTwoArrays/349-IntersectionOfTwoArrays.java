// Last updated: 7/31/2025, 2:06:13 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=nums1.length-1;
        int j=nums2.length-1;
        int k=0;
        int[] ans=new int[nums1.length];
        while(i>=0&& j>=0){
            if(nums1[i]==nums2[j]){
                if(k==0 || ans[k-1]!=nums1[i]){
                    ans[k]=nums1[i];
                    k++;
                    i--;
                    j--;
                }
                else{
                    i--;
                }
            }
            else if(nums1[i]<nums2[j]){
                j--;
            }
            else if(nums1[i]>nums2[j]){
                i--;
            }
        }
        return Arrays.copyOf(ans, k);
    }
}