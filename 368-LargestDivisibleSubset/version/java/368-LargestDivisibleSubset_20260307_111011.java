// Last updated: 07/03/2026, 11:10:11
1class Solution {
2
3    public List<Integer> largestDivisibleSubset(int[] nums) {
4       
5        Arrays.sort(nums);
6        int n = nums.length;
7       
8        int[] groupSize = new int[n];
9        int[] prevElement = new int[n];
10        int maxIndex = 0;
11
12        for(int i=0;i<n;i++) {
13            groupSize[i] = 1;
14            prevElement[i] = -1;
15            for(int j=0;j<i;j++) {
16                if(nums[i]%nums[j] == 0) {
17                    if(groupSize[i] < 1 + groupSize[j]) {
18                        groupSize[i] = 1 + groupSize[j];
19                        prevElement[i] = j;
20                    }
21                }
22            }
23            if(groupSize[i] > groupSize[maxIndex]) {
24                maxIndex = i;
25            }
26        }
27
28        List<Integer> result = new ArrayList();
29        while(maxIndex != -1) {
30            result.add(0, nums[maxIndex]);
31            maxIndex = prevElement[maxIndex];
32        }
33
34        return result;
35    }
36}