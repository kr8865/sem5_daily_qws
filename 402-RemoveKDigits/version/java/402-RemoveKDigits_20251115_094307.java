// Last updated: 15/11/2025, 09:43:07
class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> s = new Stack<>();

        // LEFT → RIGHT
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            // Remove bigger digits
            while (!s.isEmpty() && k > 0 && s.peek() > c) {
                s.pop();
                k--;
            }
            s.push(c);
        }

        // If deletions still left → remove from end
        while (k > 0 && !s.isEmpty()) {
            s.pop();
            k--;
        }

        // Stack → String
        StringBuilder sb = new StringBuilder();
        for (char c : s) sb.append(c);

        // Remove leading zeros (but keep *one* zero)
        
        String res = sb.toString().replaceFirst("^0+(?!$)", "");
        if (res.length() == 0) res = "0";

        return res;
    }
}