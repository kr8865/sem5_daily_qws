// Last updated: 03/02/2026, 09:09:23
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        Deque<Integer> dq=new ArrayDeque<>();
4         int[] ans = new int[nums.length - k + 1];
5         int idx=0;
6        for(int i=0;i<nums.length;i++){
7            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
8                dq.removeFirst();
9            }
10            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
11                dq.removeLast();
12
13            }
14            dq.addLast(i);
15            if (i >= k - 1) {
16                ans[idx++] = nums[dq.peekFirst()];
17            }
18            
19        }
20        return ans;
21    }
22}