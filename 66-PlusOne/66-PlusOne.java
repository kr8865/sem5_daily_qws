// Last updated: 7/31/2025, 2:08:06 PM
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
            
       
        
    }
}