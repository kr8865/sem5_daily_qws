// Last updated: 7/31/2025, 2:07:19 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if ("+-*/".contains(token)) {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break; // truncates toward 0
                }
            } else {
                stack.push(Integer.parseInt(token));  // Convert string to int
            }
        }

        return stack.pop();  // Final result
        
    }
}