// Last updated: 9/30/2025, 11:36:20 AM
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int[][] ans=new int[nums1.length+nums2.length][2];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0]==nums2[j][0]){
            ans[k][0]=nums1[i][0];
            ans[k][1]=nums1[i][1]+nums2[j][1];
            i++;
            j++;
            k++;
        }
        else if(nums1[i][0]>nums2[j][0]){
            ans[k][0]=nums2[j][0];
            ans[k][1]=nums2[j][1];
            j++;
            k++;


        }
        else{
            ans[k][0]=nums1[i][0];
            ans[k][1]=nums1[i][1];
            i++;
            k++;
        }
        }
        while (i < nums1.length) {
    ans[k][0] = nums1[i][0];
    ans[k][1] = nums1[i][1];
    i++;
    k++;
}

while (j < nums2.length) {
    ans[k][0] = nums2[j][0];
    ans[k][1] = nums2[j][1];
    j++;
    k++;
}
        int[][] res = new int[k][2];
        for (int x = 0; x < k; x++) {
            res[x] = ans[x];
        }

        return res;
    }
}