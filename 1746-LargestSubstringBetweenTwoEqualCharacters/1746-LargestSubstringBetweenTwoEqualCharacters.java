// Last updated: 7/31/2025, 2:04:06 PM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int c=-1;
       for(int i=0;i<s.length();i++){
        for(int j=i+1;j<s.length();j++){
            if(s.charAt(i)==s.charAt(j)){
                c=Math.max(c,(j-i-1));
            }
        }

       }
       return c;
    }
}