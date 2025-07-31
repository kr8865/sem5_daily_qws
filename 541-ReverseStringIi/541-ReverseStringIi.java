// Last updated: 7/31/2025, 2:05:33 PM
class Solution {
    public String reverseStr(String s, int k) {
        char[] ar = s.toCharArray();
    int n = ar.length;

    for (int start = 0; start < n; start += 2 * k) {
        int i = start;
        int j = Math.min(start + k - 1, n - 1); // Determine the range to reverse

        // Reverse the characters between i and j
        while (i < j) {
            char temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
        }
    }

    return new String(ar);
        
    }
}