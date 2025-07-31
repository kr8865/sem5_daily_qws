// Last updated: 7/31/2025, 2:07:28 PM
class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c<3){
                return nums[i];

            }
        }
        return -1;
    }
}