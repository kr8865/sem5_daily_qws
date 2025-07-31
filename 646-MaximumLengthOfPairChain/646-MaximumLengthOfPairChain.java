// Last updated: 7/31/2025, 2:05:12 PM
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));
        int last=pairs[0][1];
        int c=1;
        for(int i=1;i<pairs.length;i++){
            if(last<pairs[i][0]){
                c++;
                last=pairs[i][1];
            }
        }
        return c;
        
    }
}