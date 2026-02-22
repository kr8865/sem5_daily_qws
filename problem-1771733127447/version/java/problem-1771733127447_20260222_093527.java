// Last updated: 22/02/2026, 09:35:27
1class Solution {
2    public String maximumXor(String s, String t) {
3        int zero=0;
4        int one=0;
5      
6        for(int i=0;i<t.length();i++){
7            if(t.charAt(i)=='0'){
8                zero++;
9            }
10            else{
11                one++;
12            }
13        }
14        StringBuilder sb=new StringBuilder();
15        for(int i=0;i<s.length();i++){
16            char c=s.charAt(i);
17            if(c=='0'){
18                if(one>0){
19                    sb.append('1');
20                    one--;
21                }
22                else{
23                    sb.append('0');
24                    zero--;
25                }
26            }
27            else if(c=='1'){
28                if(zero>0){
29                    sb.append('1');
30                    zero--;
31                }
32                else{
33                    sb.append('0');
34                    one--;
35                }
36            }
37        }
38        return sb.toString();
39    }
40}