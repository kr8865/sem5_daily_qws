// Last updated: 7/31/2025, 2:08:09 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int minc=0,minr=0,maxc=n-1,maxr=n-1;
        int total_ele=n*n;
        int c=0;
        int num=1;
        while(c<total_ele){
            for(int i=minc;i<=maxc && c<total_ele;i++){
                matrix[minr][i]=num;
                num++;
                c++;
            }
            minr++;
            for(int i=minr;i<=maxr && c<total_ele;i++){
                matrix[i][maxc]=num;
                num++;
                c++;
            }
            maxc--;
            for(int i=maxc;i>=minc && c<total_ele;i--){
                matrix[maxr][i]=num;
                num++;
                c++;
            }
            maxr--;
            for(int i=maxr;i>=minr && c<total_ele;i--){
                matrix[i][minc]=num;
                num++;
                c++;
            }
            minc++;
        }
        return matrix;
    }
}