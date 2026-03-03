// Last updated: 03/03/2026, 19:01:50
1class Solution {
2 
3    public int countEven(int num) {
4        return ans(num,1);
5       
6        
7    }
8    public static int  ans(int num ,int si){
9        if(si>num){
10            return 0;
11        }
12        int c=0;
13        if(isEven(si)){
14            c=1;
15
16        }
17        return c+ans(num,si+1);
18        
19        
20    }
21    public static boolean isEven(int si){
22        int sum=0;
23        while(si>0){
24            int d=si%10;
25            si=si/10;
26            sum+=d;
27        }
28        if(sum%2==0){
29            return true;
30        }
31        return false;
32    }
33}