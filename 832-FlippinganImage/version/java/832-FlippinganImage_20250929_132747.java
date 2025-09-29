// Last updated: 9/29/2025, 1:27:47 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int j=0;
            int k=image.length-1;
            while(j<=k){
                int temp=image[i][j];
                image[i][j]=image[i][k]^1;
                image[i][k]=temp^1;
                j++;
                k--;
            }
        }
        return image;
    }
}