// Last updated: 15/11/2025, 10:56:15
class Solution {
    public int calculate(String s) {
       
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char lastSign = '+';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Agar digit hai → number banao
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            }

            // Agar operator mila ya last char
            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {

                if (lastSign == '+') {
                    stack.push(currentNumber);
                } 
                else if (lastSign == '-') {
                    stack.push(-currentNumber);
                } 
                else if (lastSign == '*') {
                    stack.push(stack.pop() * currentNumber);
                } 
                else if (lastSign == '/') {
                    stack.push(stack.pop() / currentNumber);
                }

                lastSign = c;   // Update operator
                currentNumber = 0;
            }
        }

        int result = 0;
        for (int num : stack) result += num;
        return result;
    }

    
    
}