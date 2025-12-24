// Last updated: 24/12/2025, 12:11:31
1class Solution {
2    public int countCollisions(String directions) {
3        Stack<Character> st = new Stack<>();
4        int collisions = 0;
5
6        for (char ch : directions.toCharArray()) {
7
8            if (ch == 'R') {
9                st.push('R');
10            }
11            else if (ch == 'S') {
12                // R -> S collisions
13                while (!st.isEmpty() && st.peek() == 'R') {
14                    collisions++;
15                    st.pop();
16                }
17                st.push('S');
18            }
19            else { // ch == 'L'
20                if (st.isEmpty()) continue;
21
22                if (st.peek() == 'R') {
23                    // first R-L collision
24                    collisions += 2;
25                    st.pop();
26
27                    // remaining R collide with stationary
28                    while (!st.isEmpty() && st.peek() == 'R') {
29                        collisions++;
30                        st.pop();
31                    }
32
33                    st.push('S');
34                }
35                else if (st.peek() == 'S') {
36                    collisions++;
37                    st.push('S');
38                }
39            }
40        }
41        return collisions;
42    }
43}
44