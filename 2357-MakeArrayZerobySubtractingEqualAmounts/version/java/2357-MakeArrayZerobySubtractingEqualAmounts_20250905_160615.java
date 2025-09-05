// Last updated: 9/5/2025, 4:06:15 PM
class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            if(num>0){
            hs.add(num);
            }
        }
        return hs.size();
    }
}