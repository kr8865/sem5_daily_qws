// Last updated: 08/03/2026, 10:15:39
1class Solution {
2    public int minOperations(String s) {
3        int n=s.length();
4        if(n<=1){
5            return 0;
6        }
7         char[] arr=s.toCharArray();
8        Arrays.sort(arr);
9        String ar=new String(arr);
10        if(s.equals(ar)){
11            return 0;
12        }
13        if(n==2){
14            return -1;
15        }
16       
17        
18        if(s.charAt(0)==ar.charAt(0) || s.charAt(n-1)==ar.charAt(n-1)){
19            return 1;
20        }
21        if (s.charAt(0) == ar.charAt(n - 1) && 
22            s.charAt(n - 1) == ar.charAt(0)) {
23            
24           
25            if (ar.charAt(0) == ar.charAt(1) || 
26                ar.charAt(n - 1) ==ar.charAt(n - 2)) {
27                return 2;
28            }
29            return 3;
30        }
31
32        return 2;
33        
34        
35    }
36}