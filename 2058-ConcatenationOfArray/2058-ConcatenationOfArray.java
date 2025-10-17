// Last updated: 10/17/2025, 8:02:01 PM
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