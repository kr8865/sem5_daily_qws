// Last updated: 7/31/2025, 2:03:50 PM
class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) { // Check if 'part' is a substring of 's'
            s = s.replaceFirst(part, ""); // Replace the first occurrence of 'part' with an empty string
        }
        return s;
    }
}
