// Last updated: 7/31/2025, 2:04:31 PM
class Solution {
    public String removeOuterParentheses(String s) {
        int c=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                c--;
            }
            if(c!=0){
                ans+=s.charAt(i);
            }
            if(s.charAt(i)=='('){
                c++;
            }

        }
return ans;
        
    }
}