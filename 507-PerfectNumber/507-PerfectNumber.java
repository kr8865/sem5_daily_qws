// Last updated: 7/31/2025, 2:05:38 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int c=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                c=c+i;
            }
        }
        if(c==num){
            return true;
        }
        return false;
        
    }
}