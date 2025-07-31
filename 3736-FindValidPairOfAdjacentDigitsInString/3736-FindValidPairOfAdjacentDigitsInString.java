// Last updated: 7/31/2025, 2:03:36 PM
class Solution {
    public String findValidPair(String s) {
        int[] freq = new int[10];
        
        // Count frequency of each digit
        for (char c : s.toCharArray()) {
            freq[c - '0']++;
        }
        
        // Find the first valid adjacent pair
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1) && 
                freq[s.charAt(i) - '0'] == s.charAt(i) - '0' && 
                freq[s.charAt(i + 1) - '0'] == s.charAt(i + 1) - '0') {
                return "" + s.charAt(i) + s.charAt(i + 1);
            }
        }
        
        return "";
    }
}