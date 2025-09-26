// Last updated: 9/26/2025, 10:48:36 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newarr=new int[2*nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            newarr[k]=nums[i];
            k++;
        }
        for(int i=0;i<nums.length;i++){
            newarr[k]=nums[i];
            k++;
        }
        return newarr;
    }
}