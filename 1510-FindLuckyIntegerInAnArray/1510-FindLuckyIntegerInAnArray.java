// Last updated: 30/10/2025, 08:35:12
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