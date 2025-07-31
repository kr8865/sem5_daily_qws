// Last updated: 7/31/2025, 2:04:12 PM
class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            while(!st.isEmpty() && prices[i]<=prices[st.peek()]){
                int c=prices[st.peek()];
                ans[st.pop()]=c-prices[i];
                }
                st.push(i);
        }
        while(!st.empty()){
            int d=st.peek();
            ans[st.pop()]=prices[d];
        }
      return ans;  
    }
}