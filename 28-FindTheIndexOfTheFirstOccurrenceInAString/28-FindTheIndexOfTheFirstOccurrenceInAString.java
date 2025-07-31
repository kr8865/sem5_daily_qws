// Last updated: 7/31/2025, 2:08:36 PM
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            int indx=haystack.indexOf(needle);
            return indx;
        }
        return -1;
    }
    
}