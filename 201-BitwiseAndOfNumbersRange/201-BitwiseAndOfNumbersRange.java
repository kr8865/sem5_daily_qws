// Last updated: 10/17/2025, 8:05:44 PM
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