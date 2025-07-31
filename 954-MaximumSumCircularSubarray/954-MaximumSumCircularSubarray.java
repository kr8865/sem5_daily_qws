// Last updated: 7/31/2025, 2:04:40 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        int linear_sum=kedane(nums);
       for(int i=0;i<nums.length;i++){
         sum=sum+nums[i];
         nums[i]=nums[i]*-1;
       }
       int mid=kedane(nums);
       int circular_sum=sum+mid;
       if(circular_sum==0){
        return linear_sum;
       }
       return Math.max(linear_sum,circular_sum);
    }
    public static int kedane(int[] nums){
        int s=0;
        int ans=Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++){
            s=s+nums[j];
            ans=Math.max(ans,s);
            
            if(s<0){
                
                s=0;
            }

        }
        return ans;
    }
}