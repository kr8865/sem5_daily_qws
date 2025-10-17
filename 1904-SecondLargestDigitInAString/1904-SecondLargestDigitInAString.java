// Last updated: 10/17/2025, 8:02:09 PM
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