// Last updated: 8/26/2025, 9:51:26 PM
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);

        }
        while(pq.size()>1){
            int y=pq.remove();
            int x=pq.remove();
            if(y!=x){
                int ny=y-x;
                pq.add(ny);

            }
        }
        if(pq.peek()==null){
            return 0;
        }
        return pq.peek();
       
    
        
    }
}