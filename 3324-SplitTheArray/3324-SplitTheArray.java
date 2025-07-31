// Last updated: 7/31/2025, 2:03:37 PM
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        if(nums.length%2!=0){
            return false;
        }
        else{
            for(int i=0;i<nums.length;i++){
                int d=1;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        d++;
                    }
                }
            
                if(d>2){
                    return false;
                }
            }
        }
        return true;
        
    }
}