// Last updated: 7/31/2025, 2:05:05 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int c=i-st.peek();
                ans[st.pop()]=c;
            }
            st.push(i);

        }
        while(!st.isEmpty()){
            ans[st.pop()]=0;
        }
        return ans;
        
    }
    
}