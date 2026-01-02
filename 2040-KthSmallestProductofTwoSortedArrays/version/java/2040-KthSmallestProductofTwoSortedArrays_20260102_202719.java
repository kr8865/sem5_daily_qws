// Last updated: 02/01/2026, 20:27:19
1class Solution {
2    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
3        long left = -10000000000L;
4        long right = 10000000000L;
5        
6        while (left < right) {
7            long mid = left + (right - left) / 2;
8            if (countProducts(nums1, nums2, mid) < k) {
9                left = mid + 1;
10            } else {
11                right = mid;
12            }
13        }
14        
15        return left;
16    }
17    
18    private long countProducts(int[] nums1, int[] nums2, long target) {
19        long count = 0;
20        for (int num1 : nums1) {
21            if (num1 == 0) {
22                if (target >= 0) count += nums2.length;
23                continue;
24            }
25            
26            int low = 0, high = nums2.length;
27            while (low < high) {
28                int mid = low + (high - low) / 2;
29                long product = (long) num1 * nums2[mid];
30                if (product <= target) {
31                    if (num1 > 0) low = mid + 1;
32                    else high = mid;
33                } else {
34                    if (num1 > 0) high = mid;
35                    else low = mid + 1;
36                }
37            }
38            
39            count += (num1 > 0) ? low : nums2.length - low;
40        }
41        return count;
42    }
43}