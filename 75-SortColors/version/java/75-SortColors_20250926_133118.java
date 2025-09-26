// Last updated: 9/26/2025, 1:31:18 PM
class Solution {
    public void sortColors(int[] nums) {
        int lo=0;
        int mid=0;
        int hi=nums.length-1;
        while(mid<=hi){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[lo];
                nums[lo]=temp;
                lo++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[hi];
                nums[hi]=temp;
                hi--;
            }
        }
    }
}