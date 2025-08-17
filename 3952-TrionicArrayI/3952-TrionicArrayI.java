// Last updated: 8/17/2025, 10:26:36 AM
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false; // changed from <5 to <4

        int i = 0;

        // First Increasing \U0001f4c8
        while (i < n - 1 && nums[i] < nums[i + 1]) i++;
        if (i == 0 || i == n - 1) return false;

        // Then Decreasing \U0001f4c9
        int mid = i;
        while (i < n - 1 && nums[i] > nums[i + 1]) i++;
        if (i == mid || i == n - 1) return false;

        // Then Increasing Again \U0001f4c8
        int last = i;
        while (i < n - 1 && nums[i] < nums[i + 1]) i++;

        return i == n - 1;
    }
}
