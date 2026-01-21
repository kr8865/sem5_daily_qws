// Last updated: 21/01/2026, 12:06:44
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int xor1=0;
4        int xor2=0;
5        for(int i=0;i<arr1.length;i++){
6            xor1^=arr1[i];
7        }
8        for(int i=0;i<arr2.length;i++){
9            xor2^=arr2[i];
10        }
11        return xor1&xor2;
12    }
13}