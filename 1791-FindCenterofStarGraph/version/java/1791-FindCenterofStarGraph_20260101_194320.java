// Last updated: 01/01/2026, 19:43:20
1class Solution {
2    public int findCenter(int[][] e) {
3    return e[0][0] == e[1][0] || e[0][0] == e[1][1] ? e[0][0] : e[0][1];
4}
5}