// Last updated: 8/26/2025, 9:51:21 PM
class Solution {
    public static class soldier implements Comparable<soldier>{
        int sol;
        int i;
        soldier(int sol,int i){
            this.sol=sol;
            this.i=i;
        }
        @Override
        public int compareTo(soldier s2){

            if(this.sol==s2.sol){
                return this.i-s2.i;
            }
            else{
                return this.sol-s2.sol;
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<soldier> pq=new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            int cs=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    cs+=mat[i][j];
                }
            }
            pq.add(new soldier(cs,i));
            


        }
        int[] ar=new int[k];
        
        for(int i=0;i<k;i++){
            ar[i]=pq.remove().i;
        }
        return ar;
        
        
    }
}