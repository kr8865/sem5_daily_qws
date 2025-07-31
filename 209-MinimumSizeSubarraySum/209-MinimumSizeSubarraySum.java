// Last updated: 7/31/2025, 2:06:53 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int k=0;
        int t=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum =sum+nums[i];
            k++;
            while(sum>=target){
                min=Math.min(min,k);
                sum=sum-nums[t];
                t++;
                
                k--;
                
            }
           
            

        }
        if(min==Integer.MAX_VALUE){
            min=0;
        }
        return min;
    }
}