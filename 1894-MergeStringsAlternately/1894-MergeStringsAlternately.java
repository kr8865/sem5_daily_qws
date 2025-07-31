// Last updated: 7/31/2025, 2:03:54 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result =new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                result.append(word1.charAt(i));
            }
            if(i<word2.length()){
                result.append(word2.charAt(i));
            }
            i++;
        }


      return new String(result);  
    }
}