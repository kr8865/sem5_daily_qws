// Last updated: 12/01/2026, 20:48:36
1class Solution {    
2    
3    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
4        int n = nums1.length;
5        
6        PriorityQueue<Integer> differences = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
7        for(int i = 0; i < n; ++i) {
8            int difference = Math.abs(nums1[i] - nums2[i]);
9            if(difference > 0) {
10                differences.offer(Math.abs(nums1[i] - nums2[i]));    
11            }            
12        }
13        
14        int k = k1 + k2;
15        while((k > 0) && (!differences.isEmpty())) {
16
17            int size = differences.size();
18            
19            int minK = k / size, element = differences.poll();                        
20            int toDelete = k < size ? 1 : Math.min(minK, element);
21            int toInsert = element - Math.min(toDelete, element);
22
23            k -= toDelete;
24            if(toInsert > 0) {
25                differences.offer(toInsert);
26            }
27        }
28        
29        long answer = 0;
30        while(!differences.isEmpty()) {
31            long element = differences.poll();            
32            answer += (element * element);
33        }        
34        
35        return answer;
36    }
37}