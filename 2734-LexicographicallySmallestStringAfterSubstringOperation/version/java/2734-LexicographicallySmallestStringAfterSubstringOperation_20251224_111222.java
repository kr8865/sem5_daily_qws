// Last updated: 24/12/2025, 11:12:22
1class Solution {
2    public String smallestString(String s) {
3        StringBuilder sb=new StringBuilder();
4        boolean sub=true;
5        int a=0;
6        for(int i=0;i<s.length();i++){
7            char ch=s.charAt(i);
8            if(ch=='a'){
9                a++;
10            }
11            else{
12                break;
13            }
14        }
15        if(a==s.length()){
16            for(int i=0;i<s.length()-1;i++){
17                sb.append('a');
18            }
19            sb.append('z');
20            return sb.toString();
21        }
22        boolean f=true;
23        for(int i=0;i<a;i++){
24            sb.append('a');
25        }
26        for(int i=a;i<s.length();i++){
27            char ch=s.charAt(i);
28            if(ch!='a'&& f){
29                sb.append((char)(ch-1));
30            }
31            else{
32                f=false;
33                sb.append(ch);
34            }
35
36        }
37
38        
39        return sb.toString();
40    }
41}