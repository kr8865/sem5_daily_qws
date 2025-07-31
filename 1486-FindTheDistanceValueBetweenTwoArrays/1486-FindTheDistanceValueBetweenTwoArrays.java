// Last updated: 7/31/2025, 2:04:18 PM
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int t=0;
        for(int i=0;i<arr1.length;i++){
            int c=0;
            for(int j=0;j<arr2.length;j++){
                
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    break;
                }
                else{
                    c++;
                }
                if(c==arr2.length){
                    t++;
                }
            }
        }
        return t;
    }
}