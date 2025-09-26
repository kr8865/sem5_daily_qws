// Last updated: 9/26/2025, 11:37:33 AM
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int count=0;
        while(left<right){
            left=left>>1;
            right=right>>1;
            count++;
        }
        return left<<count;
        
    }
}