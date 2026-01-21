// Last updated: 21/01/2026, 12:09:20
1class Solution {
2      public int getXORSum(int[] arr1, int[] arr2) {
3         int xor1=0 , xor2=0;
4         for(int val:arr1) xor1^=val;
5         for(int val:arr2) xor2^=val;
6        return (xor1&xor2);
7    }
8}