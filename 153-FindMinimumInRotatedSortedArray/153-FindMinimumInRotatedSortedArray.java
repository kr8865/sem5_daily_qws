// Last updated: 7/31/2025, 2:07:15 PM
class Solution {
    public int findMin(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                for(int k=i;k>=0;k--){
                    if(nums[k+1]<nums[k]){
                int temp=nums[k];
                nums[k]=nums[k+1];
                nums[k+1]=temp;
                    }
                }

            }
        }
        return nums[0];
    }
}