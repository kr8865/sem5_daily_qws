// Last updated: 7/31/2025, 2:06:50 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n-k];
        
    }
}