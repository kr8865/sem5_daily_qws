// Last updated: 7/31/2025, 2:04:51 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        String ans1=ans(s);
        String ans2=ans(t);
        if(ans1.length()!=ans2.length()){
            return false;
        }
        return ans1.equals(ans2);
        
    }
    public static String ans(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!st.isEmpty() && c=='#'){
                st.pop();

            }
            else if(c!='#'){
                st.push(c);
            }
        }
        String f="";
        while(!st.isEmpty()){
            f=f+st.pop();
        }
        return f;
    }
}