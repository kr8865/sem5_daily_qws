// Last updated: 09/03/2026, 15:53:09
1class Solution {
2    public int minimumOperations(String num) {
3       int ans=fn(num,'0','0');
4        ans=Math.min(ans,fn(num,'2','5'));
5        ans=Math.min(ans,fn(num,'5','0'));
6        ans=Math.min(ans,fn(num,'7','5'));
7        for(int i=0;i<num.length();i++){
8            if(num.charAt(i)=='0'){
9                ans=Math.min(ans,num.length()-1);
10            }
11        }
12        
13        return Math.min(num.length(),ans);
14
15    }
16    public static int fn(String ans,char b,char a){
17        int posA=-1;
18        int posB=-1;
19        for(int i=ans.length()-1;i>=0;i--){
20            if(ans.charAt(i)==a){
21                posA=i;
22                break;
23            }
24        }
25        if(posA==-1){
26            return Integer.MAX_VALUE;
27        }
28        for(int j=posA-1;j>=0;j--){
29            if(ans.charAt(j)==b){
30                posB=j;
31                break;
32            }
33        }
34        if(posB==-1){
35            return Integer.MAX_VALUE;
36        }
37        else{
38            return (ans.length()-posA-1)+(posA-posB-1);
39        }
40    }
41
42}