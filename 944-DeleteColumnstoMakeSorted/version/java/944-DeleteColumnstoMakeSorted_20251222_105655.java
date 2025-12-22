// Last updated: 22/12/2025, 10:56:55
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int c=0;
4        for(int i=0;i<strs[0].length();i++){
5            for(int j=0;j<strs.length-1;j++){
6                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
7                    c++;
8                    break;
9                }
10                
11
12            }
13        }
14        return c;
15    }
16}