// Last updated: 7/31/2025, 2:03:46 PM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) ans.add(i);
        }
        return ans;
    }
}