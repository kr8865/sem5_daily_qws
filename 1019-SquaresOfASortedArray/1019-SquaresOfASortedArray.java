// Last updated: 7/31/2025, 2:04:32 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int n=nums.length;
        int[] arr=new int[n];
        while(i<n){
            arr[i]=nums[i]*nums[i];
            i++;
        }
        Arrays.sort(arr);
        return arr;      
    }
    
}