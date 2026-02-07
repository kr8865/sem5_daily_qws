// Last updated: 07/02/2026, 12:26:04
1class Solution {
2    public int countDistinct(int[] nums, int k, int p) {
3        Set<List<Integer>> set = new HashSet<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            int cnt = 0;
7            List<Integer> curr = new ArrayList<>();
8
9            for (int j = i; j < nums.length; j++) {
10                if (nums[j] % p == 0) cnt++;
11                if (cnt > k) break;
12
13                curr.add(nums[j]);
14                set.add(new ArrayList<>(curr));
15            }
16        }
17        return set.size();
18    }
19}
20