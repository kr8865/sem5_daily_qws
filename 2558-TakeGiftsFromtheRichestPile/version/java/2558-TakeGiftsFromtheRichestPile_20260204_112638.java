// Last updated: 04/02/2026, 11:26:38
1class Solution {
2    public long pickGifts(int[] gifts, int k) {
3        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
4        for(int i=0;i<gifts.length;i++){
5            pq.add(gifts[i]);
6        }
7        for(int i=0;i<k;i++){
8            int t=pq.remove();
9            pq.add((int)Math.floor(Math.sqrt(t)));
10        }
11        long sum=0;
12        while(!pq.isEmpty()){
13            sum+=pq.remove();
14        }
15        return sum;
16    }
17}