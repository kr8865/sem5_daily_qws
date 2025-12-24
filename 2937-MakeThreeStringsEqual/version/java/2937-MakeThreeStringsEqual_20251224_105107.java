// Last updated: 24/12/2025, 10:51:07
1class Solution {
2    public int findMinimumOperations(String s1, String s2, String s3) {
3        int n=Math.min(s1.length(),Math.min(s2.length(),s3.length()));
4        int c=0;
5        for(int i=0;i<n;i++){
6           if(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)){
7                c++;
8            }
9            else{
10                break;
11            }
12        }
13        if(c==0){
14            return -1;
15        }
16        int v=(s1.length()-c)+(s2.length()-c)+(s3.length()-c);
17        return v;
18        
19    }
20}