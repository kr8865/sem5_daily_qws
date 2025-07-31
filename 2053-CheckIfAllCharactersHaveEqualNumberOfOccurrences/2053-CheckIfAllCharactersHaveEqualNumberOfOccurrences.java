// Last updated: 7/31/2025, 2:03:47 PM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=1;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i-1);
            if(freq[ch1-'a']!=freq[ch2-'a']){
                return false;
            }
        }  
        return true;     
    }
}