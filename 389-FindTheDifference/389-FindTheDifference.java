// Last updated: 7/31/2025, 2:06:00 PM
class Solution {
    public char findTheDifference(String s, String t) {

       char result = 0;

        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);  // XOR all chars in s
        }

        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);  // XOR all chars in t
        }

        return result;  // the extra character in t
        
    }
}