// Last updated: 9/27/2025, 1:36:38 PM
class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       return Math.max((nums[0]*nums[1]*nums[nums.length-1]),nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
        
    }
}