// Last updated: 7/31/2025, 2:05:06 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
         Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];
            boolean destroyed = false;

            // Collision check: only if top is positive and current is negative
            while (!st.isEmpty() && st.peek() > 0 && curr < 0) {
                if (st.peek() < -curr) {
                    // Top is smaller, it explodes
                    st.pop();
                    // Continue to check next one in stack
                } else if (st.peek() == -curr) {
                    // Both explode
                    st.pop();
                    destroyed = true;
                    break;
                } else {
                    // Current asteroid explodes
                    destroyed = true;
                    break;
                }
            }

            // If not destroyed in collision, push it into stack
            if (!destroyed) {
                st.push(curr);
            }
        }

        // Convert stack to result array
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}