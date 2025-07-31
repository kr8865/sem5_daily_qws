// Last updated: 7/31/2025, 2:05:11 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                int d=st.peek();
                int f=d*2;
                st.push(f);
            }
            else if(operations[i].equals("+")){
                int l=st.pop();
                int m=st.pop();
                int g=l+m;
                st.push(m);
                st.push(l);
                st.push(g);
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int ll=0;
        while(!st.isEmpty()){
            ll+=st.pop();
        }
        return ll;
        
    }
}