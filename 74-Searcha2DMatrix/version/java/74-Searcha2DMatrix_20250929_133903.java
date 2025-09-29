// Last updated: 9/29/2025, 1:39:03 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int j=matrix[0].length-1;
        int i=0;
        while(i<matrix.length && j>=0){
        if(matrix[i][j]==target){
            return true;
        }
        else if(matrix[i][j]>target){
            j--;
        }
        else{
            i++;
        }
        }
        return false;
        
    }
}