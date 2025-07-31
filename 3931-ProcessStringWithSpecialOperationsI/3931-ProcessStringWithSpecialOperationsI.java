// Last updated: 7/31/2025, 2:03:31 PM
class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                result.append(c);
            } 
            else if (c == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } 
            else if (c == '#') {
                result.append(result.toString()); // duplicate
            } 
            else if (c == '%') {
                result.reverse(); // reverse
            }
        }

        return result.toString();
    
        
    }
}