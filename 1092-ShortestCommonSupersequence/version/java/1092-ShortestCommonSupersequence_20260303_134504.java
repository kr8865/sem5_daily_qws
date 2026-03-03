// Last updated: 03/03/2026, 13:45:04
1class Solution {
2    public String shortestCommonSupersequence(String str1, String str2) {
3        // Step 1: Find the longest common subsequence using dynamic programming
4        int m = str1.length();
5        int n = str2.length();
6        int[][] dp = new int[m + 1][n + 1];
7        
8        // Fill the dp table
9        for (int i = 1; i <= m; i++) {
10            for (int j = 1; j <= n; j++) {
11                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
12                    dp[i][j] = 1 + dp[i - 1][j - 1];
13                } else {
14                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
15                }
16            }
17        }
18        
19        // Step 2: Construct the shortest common supersequence
20        // Start from the bottom right of the dp table
21        int i = m, j = n;
22        StringBuilder result = new StringBuilder();
23        
24        while (i > 0 && j > 0) {
25            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
26                // If the characters are the same, add it once
27                result.append(str1.charAt(i - 1));
28                i--;
29                j--;
30            } else if (dp[i - 1][j] > dp[i][j - 1]) {
31                // If coming from top has higher value, take character from str1
32                result.append(str1.charAt(i - 1));
33                i--;
34            } else {
35                // Otherwise, take character from str2
36                result.append(str2.charAt(j - 1));
37                j--;
38            }
39        }
40        
41        // Add remaining characters from str1 (if any)
42        while (i > 0) {
43            result.append(str1.charAt(i - 1));
44            i--;
45        }
46        
47        // Add remaining characters from str2 (if any)
48        while (j > 0) {
49            result.append(str2.charAt(j - 1));
50            j--;
51        }
52        
53        // Reverse the result to get the final supersequence
54        return result.reverse().toString();
55    }
56}