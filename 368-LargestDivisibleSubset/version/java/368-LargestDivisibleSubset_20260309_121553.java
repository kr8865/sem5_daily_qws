// Last updated: 09/03/2026, 12:15:53
1class Solution {
2
3    public List<Integer> largestDivisibleSubset(int[] nums) {
4
5        Arrays.sort(nums);
6
7        int n = nums.length;
8
9        int[] dp = new int[n];
10        int[] prev = new int[n];
11
12        Arrays.fill(dp,1);
13        Arrays.fill(prev,-1);
14
15        int maxL = 1;
16        int maxIndex = 0;
17
18        for(int i = 0; i < n; i++){
19
20            for(int j = 0; j < i; j++){
21
22                if(nums[i] % nums[j] == 0){
23
24                    if(dp[i] < dp[j] + 1){
25                        dp[i] = dp[j] + 1;
26                        prev[i] = j;
27                    }
28                }
29            }
30
31            if(dp[i] > maxL){
32                maxL = dp[i];
33                maxIndex = i;
34            }
35        }
36
37        List<Integer> result = new ArrayList<>();
38
39        while(maxIndex != -1){
40            result.add(nums[maxIndex]);
41            maxIndex = prev[maxIndex];
42        }
43
44        return result;
45    }
46}