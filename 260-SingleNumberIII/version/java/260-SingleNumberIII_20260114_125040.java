// Last updated: 14/01/2026, 12:50:40
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        return singleNum(nums);
4    }
5    public static int[] singleNum(int[] arr){
6        int xor = 0;
7        for(int i=0; i<arr.length; i++){
8            xor = xor^arr[i];
9        }
10
11        int mask = (xor & (-1*xor));
12        int a = 0;
13        for(int i=0; i<arr.length; i++){
14            if((mask & arr[i]) != 0){
15                a = a^arr[i];
16            }
17        }
18
19        int b = xor^a;
20        
21        return new int[] {a,b};
22    }
23}