// Last updated: 7/31/2025, 2:08:54 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    int arr[]={i,j};
                    return arr;
                }
            }
        }
        int arr[]={-1,-1};
        return arr;
    }
}