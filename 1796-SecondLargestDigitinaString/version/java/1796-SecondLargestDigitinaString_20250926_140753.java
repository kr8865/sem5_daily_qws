// Last updated: 9/26/2025, 2:07:53 PM
class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int smax=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!Character.isLetter(c)){
                int val=c-'0';
                if(val>max){
                    smax=max;
                    max=val;
                }
                else if(val>smax && val!=max){
                    smax=val;
                }
            }
        }
        return smax;
    }
}