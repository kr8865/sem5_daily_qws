// Last updated: 7/31/2025, 2:04:09 PM
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<logs.length;i++){
            String  c= logs[i];
            if(!st.isEmpty() && c.equals("../")){
                st.pop();
            }
            else if(!c.equals("./") && !c.equals("../")){
                st.push(c);
            }
        }
        
        return st.size();
        
    }
}