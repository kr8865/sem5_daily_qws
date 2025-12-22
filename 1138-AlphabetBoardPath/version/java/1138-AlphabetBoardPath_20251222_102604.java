// Last updated: 22/12/2025, 10:26:04
1class Solution {
2    public String alphabetBoardPath(String target) {
3        int cr=0;
4        int cc=0;
5        StringBuilder ans= new StringBuilder();
6        for(char c:target.toCharArray()){
7            int idx= c-'a';
8            int row=idx/5;
9            int col=idx%5;
10            while(cr>row){
11                cr--;
12                ans.append("U");
13
14            }
15            while(cc>col){
16                cc--;
17                ans.append("L");
18
19            }
20            while(cr<row){
21                cr++;
22                ans.append("D");
23
24            }
25            
26            while(cc<col){
27                cc++;
28                ans.append("R");
29            }
30            
31            
32            ans.append("!");
33
34        }
35        return ans.toString();
36    }
37}