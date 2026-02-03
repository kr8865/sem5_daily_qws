// Last updated: 03/02/2026, 15:43:46
1class Solution {
2    public int halveArray(int[] nums) {
3        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
4        double sum=0;
5        for(int i=0;i<nums.length;i++){
6            sum+=nums[i];
7        }
8        for(int i=0;i<nums.length;i++){
9            pq.add((double) nums[i]);
10        }
11        double ts=0;
12        int op=0;
13        while(ts<(sum/2)){
14            double v=pq.remove();
15            op++;
16            ts+=(v/2);
17             pq.add(v/2);
18
19
20
21
22        }
23        return op;
24        
25    }
26}