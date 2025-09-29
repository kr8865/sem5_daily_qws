// Last updated: 9/29/2025, 11:55:44 PM
class Solution {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        int min=0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}