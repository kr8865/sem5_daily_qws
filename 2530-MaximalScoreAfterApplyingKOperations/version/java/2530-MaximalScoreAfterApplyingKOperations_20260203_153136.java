// Last updated: 03/02/2026, 15:31:36
1class Solution {
2    public long maxKelements(int[] nums, int k) {
3        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
4        long score=0;
5        for(int i=0;i<nums.length;i++){
6            pq.add(nums[i]);
7        }
8        for(int i=0;i<k;i++){
9            int v=pq.remove();
10            score+=v;
11            pq.add((v+2)/3);
12        }
13        return score;
14        
15    }
16}