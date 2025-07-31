// Last updated: 7/31/2025, 2:05:57 PM
class Solution {
    public String decodeString(String s) {
         Stack<Integer> integerStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();
        String temp = "", result = "";

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int count = 0;

            // If digit, calculate full number and push to integerStack
            if (Character.isDigit(currentChar)) {
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; // adjust because for loop will increment
                integerStack.push(count);
            }

            // If closing bracket ']', process the encoded substring
            else if (currentChar == ']') {
                temp = "";

                // Get repeat count
                if (!integerStack.isEmpty()) {
                    count = integerStack.pop();
                }

                // Pop characters until '[' is found
                while (!charStack.isEmpty() && charStack.peek() != '[') {
                    temp = charStack.pop() + temp;
                }

                // Remove the opening '['
                if (!charStack.isEmpty() && charStack.peek() == '[') {
                    charStack.pop();
                }

                // Repeat and push the expanded result back to stack
                result = temp.repeat(count);
                for (char ch : result.toCharArray()) {
                    charStack.push(ch);
                }

                result = ""; // reset result
            }

            // If opening bracket, just push it
            else if (currentChar == '[') {
                charStack.push(currentChar);
            }

            // If alphabet character
            else {
                charStack.push(currentChar);
            }
        }

        // Final assembly from the character stack
        while (!charStack.isEmpty()) {
            result = charStack.pop() + result;
        }

        return result;
    }
}