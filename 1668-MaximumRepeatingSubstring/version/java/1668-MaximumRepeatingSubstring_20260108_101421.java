// Last updated: 08/01/2026, 10:14:21
1class Solution {
2    public int maxRepeating(String sequence, String word) {
3        int count=0;
4        String tar = word;
5
6        while(sequence.contains(tar)){
7            count++;
8            tar = tar+word;
9        }
10        return count;
11    }
12}