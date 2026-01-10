// Last updated: 10/01/2026, 13:19:33
1class Solution {
2    public int longestSubsequence(int[] arr, int difference) {
3        Map<Integer, Integer> m = new HashMap<>();
4        int mx = 0;
5        for (int i = 0; i < arr.length; i++) {
6            int c = arr[i];
7            if (m.containsKey(c - difference))
8                m.put(c, m.get(c - difference) + 1);
9            else
10                m.put(c, 1);
11            mx = Math.max(mx, m.get(c));
12        }
13        return mx;
14    }
15}