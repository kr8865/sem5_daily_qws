// Last updated: 7/31/2025, 2:06:16 PM
class Solution {
    public void reverseString(char[] s) {
        int st=0;
        int la=s.length-1;
        while(st<la){
            char temp=s[st];
            s[st]=s[la];
            s[la]=temp;
            st++;
            la--;

        }
        
    }
}