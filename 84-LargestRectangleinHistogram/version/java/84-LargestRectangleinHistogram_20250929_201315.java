// Last updated: 9/29/2025, 8:13:15 PM
class Solution {
    public int largestRectangleArea(int[] heights) {
        int area=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                int h=heights[st.pop()];
                if(st.isEmpty()){
                    area=Math.max(area,h*i);
                }
                else{
                    area=Math.max(area,h*(i-st.peek()-1));
                }
            }
            st.push(i);
        }
        int n =heights.length;
        while (!st.isEmpty()) {
            int top = st.pop();
            int height = heights[top];
            int width = st.isEmpty() ? n : n - st.peek() - 1;
            area = Math.max(area, height * width);
        }

        return area;
        
    }
}