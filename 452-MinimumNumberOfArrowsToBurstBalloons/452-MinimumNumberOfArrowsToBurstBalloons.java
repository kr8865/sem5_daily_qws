// Last updated: 10/17/2025, 8:04:42 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int si=points[0][0];
        int ei=points[0][1];
        int a=1;
        for(int i=1;i<points.length;i++){
            if(points[i][0]>ei){
                a++;
                si=points[i][0];
                ei=points[i][1];
            }
        }
        return a;
        
    }
}