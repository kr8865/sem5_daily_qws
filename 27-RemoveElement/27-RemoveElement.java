// Last updated: 7/31/2025, 2:08:38 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        int n=nums.length;
       int  k=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
    return k;
        
    }
}