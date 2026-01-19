// Last updated: 19/01/2026, 14:56:02
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> st=new Stack<>();
4        for(int i=0;i<operations.length;i++){
5            if(operations[i].equals("C")){
6                st.pop();
7            }
8            else if(operations[i].equals("D")){
9                int v=st.peek();
10                int ans=v*2;
11                st.push(ans);
12            }
13            else if(operations[i].equals("+")){
14                int v=st.peek();
15               int k=st.pop();
16                int g=st.peek();
17                int l=st.pop();
18                st.push(l);
19                st.push(k);
20                
21                int a=v+g;
22                st.push(a);
23            }
24            else{
25                st.push(Integer.parseInt(operations[i]));
26            }
27        }
28        int sum=0;
29        while(!st.isEmpty()){
30            int v=st.pop();
31            sum+=v;
32
33        }
34        return sum;
35        
36    }
37}