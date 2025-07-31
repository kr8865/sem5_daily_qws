// Last updated: 7/31/2025, 2:05:53 PM
class Solution {
    public int thirdMax(int[] nums) {
        int val1=Integer.MIN_VALUE;
        int val2=Integer.MIN_VALUE;
        int val3=Integer.MIN_VALUE;
        int c=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                c++;
            }
        }
        if(c<3){
            return nums[nums.length-1];
        }
        for(int i=0;i<nums.length;i++){
            if(val1<=nums[i]){
                val1=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(val2<=nums[i] && nums[i]!=val1){
                val2=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(val3<=nums[i] && nums[i]!=val1){
                if(val3<=nums[i] && nums[i]!=val2){
                    val3=nums[i];
                }
            }
        }
        return val3;
    }
}