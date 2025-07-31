// Last updated: 7/31/2025, 2:08:24 PM
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int sum=0;
        int[] right=new int[n];
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[n-1]=height[n-1];
        for(int j=n-2;j>=0;j--){
            right[j]=Math.max(right[j+1],height[j]);
        }
        for(int k=0;k<height.length;k++){
            sum+=Math.min(right[k],left[k])-height[k];

        }
        return sum;
    }
}