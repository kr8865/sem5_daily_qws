// Last updated: 7/31/2025, 2:08:52 PM
class Solution {
    public boolean isPalindrome(int x) {
        int d=0;
        int e=x;
        while(x>0){
            int c=x%10;
            d=d*10+c;
            x=x/10;

        }
        if(e==d){
            return true;
        }
        return false;
        
    }
}