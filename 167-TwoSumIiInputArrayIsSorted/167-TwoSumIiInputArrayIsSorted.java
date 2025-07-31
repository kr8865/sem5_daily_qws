// Last updated: 7/31/2025, 2:07:06 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                int arr[]={left+1,right+1};
                return arr;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        int arr[]={-1,-1};
        return arr;
    }
}