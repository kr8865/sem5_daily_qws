// Last updated: 08/03/2026, 10:30:40
1class Solution {
2    public int[] replaceElements(int[] arr) {
3
4        int max = -1;
5
6        for(int i = arr.length - 1; i >= 0; i--) {
7            int temp = arr[i];
8            arr[i] = max;
9            max = Math.max(max, temp);
10        }
11
12        return arr;
13    }
14}