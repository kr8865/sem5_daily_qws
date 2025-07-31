// Last updated: 7/31/2025, 2:08:14 PM
class Solution {
    public int maxSubArray(int[] nums) {
        return Maximum_Sum(nums);
    }
     public static int Maximum_Sum(int[] arr) {
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}

}
   
        
