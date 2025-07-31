// Last updated: 7/31/2025, 2:05:36 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        int t=0;
        int n=word.length();
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))==true){
                c++;
            }
        }
        if(c==n){
            return true;
        }
        for(int j=1;j<word.length();j++){
            if(Character.isLowerCase(word.charAt(j))==true){
                t++;
            }
        }
        if(t==n-1){
            return true;
        }
        return false;
        
    }
}