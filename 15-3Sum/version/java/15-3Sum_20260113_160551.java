// Last updated: 13/01/2026, 16:05:51
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        Arrays.sort(nums);
5
6        for(int i = 0; i < nums.length - 2; i++) {
7            if(i > 0 && nums[i] == nums[i - 1]) continue;
8
9            int j = i + 1, k = nums.length - 1;
10            int target = -nums[i];
11
12            while(j < k) {
13                int sum = nums[j] + nums[k];
14
15                if(sum == target) {
16                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
17                    j++;
18                    k--;
19
20                    while(j < k && nums[j] == nums[j - 1]) j++;
21                    while(j < k && nums[k] == nums[k + 1]) k--;
22                }
23                else if(sum > target) k--;
24                else j++;
25            }
26        }
27        return res;
28    }
29}
30