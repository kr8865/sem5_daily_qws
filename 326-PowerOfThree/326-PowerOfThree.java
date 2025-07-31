// Last updated: 7/31/2025, 2:06:20 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n%3==0){
            n=n/3;
        }
        if(n==1){
            return true;
        }
        return false;
        
    }
}