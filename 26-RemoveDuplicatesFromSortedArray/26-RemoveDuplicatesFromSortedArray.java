// Last updated: 7/31/2025, 2:08:39 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
         for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                int j=i;
                while(j<n-1){
                    nums[j]=nums[j+1];
                    j++;
                }
                n--;
                i--;

            }
        }
        return n;
        
    }
}