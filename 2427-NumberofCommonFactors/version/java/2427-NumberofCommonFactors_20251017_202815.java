// Last updated: 10/17/2025, 8:28:15 PM
class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        int i=1;
      
        while(i<=a && i<=b){
            if(a%i==0 && b%i==0){
                c++;
            }
            i++;
        }
        return c;
        
    }
}