// Last updated: 9/29/2025, 11:55:12 PM
class Solution {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        int min=0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i+=2){
            min=Math.min(nums[i],nums[i+1]);
            sum+=min;
        }
        return sum;
    }
}