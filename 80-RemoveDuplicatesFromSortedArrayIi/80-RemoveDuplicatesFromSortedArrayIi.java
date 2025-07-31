// Last updated: 7/31/2025, 2:07:55 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int curr=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
                if(count<=2){
                    nums[curr]=nums[i];
                    curr++;
                }
            }
            else{
                count=1;
                nums[curr]=nums[i];
                curr++;
            }
        }
        return curr;
    }

}