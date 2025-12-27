// Last updated: 27/12/2025, 10:40:52
1class Solution {
2    public String resultingString(String s) {
3        Stack<Integer> st=new Stack<>();
4        for(int i=0;i<s.length();i++){
5             if (!st.isEmpty() &&
6               (Math.abs(s.charAt(st.peek()) - s.charAt(i)) == 1 ||
7                Math.abs(s.charAt(st.peek()) - s.charAt(i)) == 25)) {
8                st.pop();
9            } 
10               
11
12            
13            else{
14                st.push(i);
15            }
16
17        }
18        if(st.size()==0){
19            return "";
20        }
21        StringBuilder f= new StringBuilder();
22        while(!st.isEmpty()){
23           f.append(s.charAt(st.peek()));
24            st.pop();
25        }
26        return f.reverse().toString();
27        
28    }
29}