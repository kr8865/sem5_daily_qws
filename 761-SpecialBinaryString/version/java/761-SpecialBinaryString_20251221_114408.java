// Last updated: 21/12/2025, 11:44:08
1import java.util.*;
2
3class Solution {
4    public String makeLargestSpecial(String s) {
5
6        List<String> list = new ArrayList<>();
7        int count = 0;
8        int start = 0;
9
10        // Step 1: Split into primitive special substrings
11        for (int i = 0; i < s.length(); i++) {
12            if (s.charAt(i) == '1') count++;
13            else count--;
14
15            // Found a valid special substring
16            if (count == 0) {
17                // Remove outer 1 and 0, recurse inside
18                String inner = s.substring(start + 1, i);
19                String processed = "1" + makeLargestSpecial(inner) + "0";
20                list.add(processed);
21                start = i + 1;
22            }
23        }
24
25        // Step 2: Sort in descending order
26        Collections.sort(list, Collections.reverseOrder());
27
28        // Step 3: Join all substrings
29        StringBuilder result = new StringBuilder();
30        for (String str : list) {
31            result.append(str);
32        }
33
34        return result.toString();
35    }
36}
37