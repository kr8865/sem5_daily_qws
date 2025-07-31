// Last updated: 7/31/2025, 2:07:51 PM
class Solution {
    public int largestRectangleArea(int[] heights) {

        return Larget_Histo(heights);
        
    }
    public static int Larget_Histo(int[] arr){
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    ans=Math.max(h*r,ans);
                }
                else{
                    int l=st.peek();
                    int area=h*(r-l-1);
                    ans=Math.max(area,ans);
                }
            }
            st.push(i);
                
            }
            int r=arr.length;
            while(!st.isEmpty()){
                int h=arr[st.pop()];
                if(st.isEmpty()){
                    ans=Math.max(h*r,ans);
                }
                else{
                    int l=st.peek();
                    int area=h*(r-l-1);
                    ans=Math.max(area,ans);
                }
            }
        
        return ans;
    }
}
