// Last updated: 7/31/2025, 2:05:50 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingDouble(o->o[1]));
        int lastend=intervals[0][1];
        int max=1;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=lastend){
                max++;
                lastend=intervals[i][1];
            }

        }
        return intervals.length-max;
        
    }
}