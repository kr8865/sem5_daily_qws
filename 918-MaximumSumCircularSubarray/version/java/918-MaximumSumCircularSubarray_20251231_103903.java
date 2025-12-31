// Last updated: 31/12/2025, 10:39:03
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int total=0;
4        for(int i=0;i<nums.length;i++){
5            total+=nums[i];
6        }
7        int min_sum=kedanes(nums);
8        int normal_sum=kedanemax(nums);
9        int max_sum=total-min_sum;
10        if(max_sum==0){
11            return normal_sum;
12        }
13        return Math.max(normal_sum,max_sum);
14    }
15    public static int kedanes(int[] nums){
16        int sum=0;
17        int total=Integer.MAX_VALUE;
18        for(int i=0;i<nums.length;i++){
19           sum+=nums[i];
20           total=Math.min(sum,total);
21           if(sum>0){
22            sum=0;
23           }
24        }
25        return total;
26    }
27    public static int kedanemax(int[] nums){
28        int sum=0;
29        int total=Integer.MIN_VALUE;
30        for(int i=0;i<nums.length;i++){
31           sum+=nums[i];
32           total=Math.max(sum,total);
33           if(sum<0){
34            sum=0;
35           }
36        }
37        return total;
38    }
39}