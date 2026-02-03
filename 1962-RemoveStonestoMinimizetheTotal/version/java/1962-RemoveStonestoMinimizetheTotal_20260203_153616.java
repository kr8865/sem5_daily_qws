// Last updated: 03/02/2026, 15:36:16
1class Solution {
2    public int minStoneSum(int[] piles, int k) {
3        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
4        for(int i=0;i<piles.length;i++){
5            pq.add(piles[i]);
6        }
7        for(int i=0;i<k;i++){
8            int v=pq.remove();
9            pq.add(v-(int)Math.floor(v/2.0));
10        }
11        int sum=0;
12        while(!pq.isEmpty()){
13            sum+=pq.remove();
14
15        }
16        return sum;
17        
18    }
19}