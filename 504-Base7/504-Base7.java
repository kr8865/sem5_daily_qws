// Last updated: 7/31/2025, 2:05:39 PM
class Solution {
    public String convertToBase7(int num) {
        String c="";
        int l=num;
        if(num==0){
            return "0";
        }
        num =Math.abs(num);
        
        

        while(num>0){
            int d=num%7;
            c=d+c;
            num=num/7;
        }
        if(l<0){
            c="-"+c;
        }
        
        
    return c;
        
    }
}