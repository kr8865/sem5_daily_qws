// Last updated: 9/29/2025, 2:14:38 PM
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> ll=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;;
            
            int idx=0;
            for(int j=0;j<matrix[0].length;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                    idx=j;
                }

            }
            int max=Integer.MIN_VALUE;
            for(int k=0;k<matrix.length;k++){
                if(max<matrix[k][idx]){
                    max=matrix[k][idx];
                }
            }
            if(max==min){
                ll.add(max);
            }
        }
        
        return ll;
    }
}