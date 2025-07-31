// Last updated: 7/31/2025, 2:06:26 PM
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
            k++;
        }
        return nums.length;
    }
}