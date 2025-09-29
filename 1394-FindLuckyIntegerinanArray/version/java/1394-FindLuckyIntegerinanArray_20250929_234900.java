// Last updated: 9/29/2025, 11:49:00 PM
class Solution {
    public int findLucky(int[] arr) {
        int ma=-1;
        for(int i=0;i<arr.length;i++){
            ma=Math.max(arr[i],ma);
        }
      int[] freq=new int[501];

      for(int i=0;i<arr.length;i++){
        freq[arr[i]]++;

      }
      int max=-1;
      for(int j=1;j<freq.length;j++){
        if(freq[j]==j){
            max=Math.max(max,j);
        }
      }
      return max;
    }
}