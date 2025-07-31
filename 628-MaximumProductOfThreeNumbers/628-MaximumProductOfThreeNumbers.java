// Last updated: 7/31/2025, 2:05:19 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        return Math.max((nums[n-2]*nums[n-1]*nums[n]),nums[0]*nums[1]*nums[n]);

        
    }
}