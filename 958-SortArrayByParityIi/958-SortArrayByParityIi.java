// Last updated: 7/31/2025, 2:04:37 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int temp[]=new int[nums.length];
        int j=0;
        int k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                temp[j]=nums[i];
                j=j+2;
            }
            else if(nums[i]%2!=0){
                temp[k]=nums[i];
                k=k+2;
            }
        }
      return temp;  
    }
}