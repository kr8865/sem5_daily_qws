// Last updated: 7/31/2025, 2:06:05 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int i=matrix[0][0];
        int j=matrix[n-1][n-1];
        while(i<j){
            int mid=i+(j-i)/2;
            int pos=count(matrix,mid);
            if(pos<k){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return i;

        

    }
    public static int count(int[][] matrix,int mid){
        int i=matrix.length-1;
        int j=0;
        int c=0;
        while(i>=0 && j<matrix.length){
            if(matrix[i][j]>mid){
                i--;
            }
            else{
                c+=i+1;
                j++;
            }
            

        }return c;
    }
}
/*class Solution {
public:
    int solve(vector<vector<int>>& matrix, int mid){
        int count = 0, n = matrix.size(), i = n-1, j = 0;
        while(i >= 0 && j < n){
            if(matrix[i][j] > mid) i--;
            else{
                count += (i+1);
                j++;
            }
        }
        return count;
    }
    int kthSmallest(vector<vector<int>>& matrix, int k) {
        int n = matrix.size(), i = matrix[0][0], j = matrix[n-1][n-1];
        while(i < j){
            int mid = i + (j-i)/2;
            int posi = solve(matrix, mid);
            if(posi < k) i = mid+1;
            else j = mid;
        }
        return i;
    }  
};*/