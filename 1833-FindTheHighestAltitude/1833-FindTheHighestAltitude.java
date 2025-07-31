// Last updated: 7/31/2025, 2:03:56 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int c=0;
        int i=0;
        int max=0;
        while(i<gain.length){
            c=c+gain[i];
            max=Math.max(c,max);
            i++;
        }
       return max; 
    }
}