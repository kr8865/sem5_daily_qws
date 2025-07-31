// Last updated: 7/31/2025, 2:06:32 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int c=matrix[0].length-1;
        while(row<=matrix.length-1 && c >=0){
            if(matrix[row][c]==target){
                return true;
            }
            else if(matrix[row][c]>target){
                c--;
            }
            else{
                row++;
            }
        }
        return false;
        
    }
}