// Last updated: 7/31/2025, 2:08:53 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] farr=Merge_Two_Array(nums1,nums2);
        if(farr.length%2==0){
            double med1=farr[(farr.length/2)-1];
            double med2=farr[(farr.length/2)];
            return (med1+med2)/2;
        }
        else{
           return  farr[((farr.length+1)/2)-1];
        }
    }
    public static int[] Merge_Two_Array(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			} else {
				ans[k] = arr2[j];
				k++;
				j++;
			}
		}
		while (i < n) {
			ans[k] = arr1[i];
			k++;
			i++;
		}
		while (j < m) {
			ans[k] = arr2[j];
			k++;
			j++;
		}
		return ans;
	}
}