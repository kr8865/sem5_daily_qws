// Last updated: 7/31/2025, 2:07:00 PM
class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>0){
            if(n%2==1){
                c++;

            }
            n=n/2;
        }
        return c;
        
    }
}