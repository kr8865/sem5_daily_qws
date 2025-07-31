// Last updated: 7/31/2025, 2:05:31 PM
class Solution {
    public boolean checkRecord(String s) {
        int ca=0;
        int cl=0;
        int cp=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='A'){
                ca++;
                if(ca>=2){
                    return false;
                }
                cl=0;
            }
            else if(c=='L'){
                cl++;
                if(cl>=3){
                    return false;
                }
            }
            else{
                cl=0;
                
            }
            
        }
        return true;
        
    }
}