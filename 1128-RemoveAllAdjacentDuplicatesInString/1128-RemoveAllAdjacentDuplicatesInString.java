// Last updated: 7/31/2025, 2:04:30 PM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && st.peek()==ch){
                while(!st.isEmpty() && st.peek()==ch){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
            
        }
        StringBuilder result = new StringBuilder();
       for (char ch : st) {
        result.append(ch);
}

        return result.toString();
        
    }
}