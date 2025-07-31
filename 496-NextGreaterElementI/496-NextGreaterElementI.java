// Last updated: 7/31/2025, 2:05:43 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans1=new int[nums2.length];
        int[] ans2=new int[nums1.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
              
                ans1[st.pop()]=nums2[i];

            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans1[st.pop()]=-1;
        }
        int k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans2[k]=ans1[j];
                }
                
            }
            k++;

        }
        return ans2;
    }
}