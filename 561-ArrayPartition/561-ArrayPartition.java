// Last updated: 10/17/2025, 8:03:53 PM
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