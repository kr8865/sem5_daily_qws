// Last updated: 8/26/2025, 9:50:50 PM
class Solution {
    public boolean partitionArray(int[] nums, int k) {
         int freq[]=new int[100001];
        if(nums.length%k!=0){
            return false;
        }
           
            int groups=nums.length/k;
            for(int num:nums){
                freq[num]++;
                if(freq[num]>groups){
                    return false;
                }
            }
        
        return true;
        
    }
}