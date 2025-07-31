// Last updated: 7/31/2025, 2:08:10 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        int n=arr.length-1;
        String t=arr[n];
        return t.length();

        
    }
}