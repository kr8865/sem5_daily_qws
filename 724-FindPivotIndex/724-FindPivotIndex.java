// Last updated: 7/31/2025, 2:05:08 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] right=new int[n];
        int[] left=new int[n];
        right[0]=0;
        for(int i=1;i<n;i++){
            right[i]=right[i-1]+nums[i-1];
        } 
        left[n-1]=0;
        for(int j=n-2;j>=0;j--){
            left[j]=left[j+1]+nums[j+1];
        } 
        for(int k=0;k<n;k++){
            if(left[k]==right[k]){
                return k;
            }
        }  
        return -1;    
    }
}