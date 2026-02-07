// Last updated: 07/02/2026, 11:53:08
1class Solution {
2    public int numberOfSubstrings(String s) {
3        int[] freq = new int[3];
4
5        // Left pointer for the sliding window
6        int left = 0;
7
8        // Result variable to store count of valid substrings
9        int res = 0;
10
11        // Traverse the string with right pointer
12        for (int right = 0; right < s.length(); right++) {
13            // Increment frequency of current character
14            freq[s.charAt(right) - 'a']++;
15
16            // Shrink the window from the left while all characters are present
17            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
18                // Count substrings from current right to end
19                res += (s.length() - right);
20
21                // Move left pointer and update frequency
22                freq[s.charAt(left) - 'a']--;
23                left++;
24            }
25        }
26
27        return res;
28    }
29}