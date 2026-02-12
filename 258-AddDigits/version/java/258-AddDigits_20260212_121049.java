// Last updated: 12/02/2026, 12:10:49
1class Solution {
2    public int addDigits(int num) {
3        int sum=add(num);
4        return sum;
5    }
6    public static int add(int num){
7        if(num<10){
8            return num;
9        }
10        int s=0;
11        while(num>0){
12            int d=num%10;
13            s+=d;
14
15            num=num/10;
16        }
17        int v=add(s);
18        return v;
19    }
20}