// Last updated: 7/31/2025, 2:05:40 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        int n=nums.length;

        for(int i=0;i<nums.length*2;i++){
            int k=i%n;
            while(!st.isEmpty() && nums[st.peek()]<nums[k]){
                ans[st.peek()]=nums[k];
                st.pop();
            }
            if(i<n){
                st.push(k);
            }
        }
        while(!st.isEmpty()){
            ans[st.peek()]=-1;
            st.pop();
        }
        return ans;
        
    }
}