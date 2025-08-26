// Last updated: 8/26/2025, 9:51:29 PM
class Solution {
    public static class axis implements Comparable<axis>{
        int x;
        int y;
        int dist;
        axis(int x,int y,int dist){
            this.x=x;
            this.y=y;
            this.dist=dist;
        }
        @Override
        public int compareTo(axis a2){
            return this.dist-a2.dist;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<axis> pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int dis=points[i][0]*points[i][0]+points[i][1]*points[i][1];
            pq.add(new axis(points[i][0], points[i][1], dis));

        }
        int[][] arr=new int[k][2];
        for(int i=0;i<arr.length;i++){
                arr[i][0]=pq.peek().x;
                arr[i][1]=pq.peek().y;
                pq.remove();
            
        }
return arr;

        
    }
}