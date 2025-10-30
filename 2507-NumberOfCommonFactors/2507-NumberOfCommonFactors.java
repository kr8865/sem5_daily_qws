// Last updated: 30/10/2025, 08:34:50
class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        int i=1;
        int v=Math.min(a,b);
      
        while(i<=v){
            if(a%i==0 && b%i==0){
                c++;
            }
            i++;
        }
        return c;
        
    }
}