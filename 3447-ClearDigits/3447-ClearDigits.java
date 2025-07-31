// Last updated: 7/31/2025, 2:03:34 PM
class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!st.isEmpty() && Character.isDigit(c)){
                st.pop();
            }
            else if(Character.isLetter(c)){

                st.push(c);
            }
            
        }
        StringBuilder sb=new StringBuilder();
        for(char i : st){
            sb.append(i);
        }
        return sb.toString();
    }
}