// Last updated: 7/31/2025, 2:06:04 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];
        for(int i=0;i<magazine.length();i++){
           char  ch=magazine.charAt(i);
            freq[ch-'a']++;
        } 
        for(int j=0;j<ransomNote.length();j++){
            if(freq[ransomNote.charAt(j)-'a']==0){
                return false;
            }
            freq[ransomNote.charAt(j)-'a']--;
        }
        return true;  
    }
}