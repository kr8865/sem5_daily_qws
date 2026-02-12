// Last updated: 12/02/2026, 11:40:38
1class Solution {
2    public String largestNumber(int[] nums) {
3        String[] ans=new String[nums.length];
4        for(int i=0;i<nums.length;i++){
5            ans[i]=String.valueOf(nums[i]);
6        }
7        Arrays.sort(ans, (a, b) -> {
8            return (b + a).compareTo(a + b);
9        });
10        if(ans[0].equals("0")) return "0";
11        String v="";
12        for(int i=0;i<ans.length;i++){
13            v+=ans[i];
14        }
15        return v;
16        
17    }
18}