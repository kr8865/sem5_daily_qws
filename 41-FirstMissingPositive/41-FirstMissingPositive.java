// Last updated: 10/17/2025, 8:07:44 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> ha=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
            ha.add(nums[i]);
            }
        }
        
       for(int i=1;i<=nums.length+1;i++){
        if(!ha.contains(i)){
            return i;
        }
       }
        
        return 1;
    }
}