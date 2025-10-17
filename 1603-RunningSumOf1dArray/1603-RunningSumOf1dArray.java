// Last updated: 10/17/2025, 8:02:21 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int s=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            arr[i]=s;


        }
        return arr;
        
    }
}