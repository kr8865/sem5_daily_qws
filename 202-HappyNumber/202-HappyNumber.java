// Last updated: 7/31/2025, 2:06:56 PM
class Solution {
    public boolean isHappy(int n) {
        while(n!=0){
            int sum=0;
            while(n!=0){
                int r = n%10;
                sum=sum+r*r;
                n=n/10;

            }
            n=sum;
            if(sum==1){
                return true;
            }
            if(sum==4){
                return false;
            }
        }
        return false; 
}
        
       
            
}
        
    
   
