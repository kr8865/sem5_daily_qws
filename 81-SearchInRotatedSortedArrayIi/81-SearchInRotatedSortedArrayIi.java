// Last updated: 7/31/2025, 2:07:53 PM
class Solution {
    public boolean search(int[] nums, int target) {
        int k=target;
        int low = 0, high = nums.length- 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            // if mid points to the target
            if (nums[mid]== target){
                return true;
            }
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            // if left part is sorted
            if (nums[low]<= nums[mid]) {
                if (nums[low] <= k && k <= nums[mid]) {
                    // element exists
                    high = mid - 1;
                } else {
                    // element does not exist
                    low = mid + 1;
                }
            } else { // if right part is sorted
                if (nums[mid] <= k && k <= nums[high]) {
                    // element exists
                    low = mid + 1;
                } else {
                    // element does not exist
                    high = mid - 1;
                }
            }
        }
        return false;
        
    }
}