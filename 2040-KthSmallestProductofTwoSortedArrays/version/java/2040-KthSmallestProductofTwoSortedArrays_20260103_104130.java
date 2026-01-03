// Last updated: 03/01/2026, 10:41:30
1class Solution {
2    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
3        Arrays.sort(nums1);
4        Arrays.sort(nums2);
5
6        long left = -10000000000L;
7        long right = 10000000000L;
8
9        while (left < right) {
10            long mid = left + (right - left) / 2;
11            if (countProducts(nums1, nums2, mid) < k) {
12                left = mid + 1;
13            } else {
14                right = mid;
15            }
16        }
17        return left;
18    }
19
20    private long countProducts(int[] nums1, int[] nums2, long target) {
21        int n = nums2.length;
22        long c = 0;
23
24        for (int i = 0; i < nums1.length; i++) {
25
26            if (nums1[i] >= 0) {
27                int l = 0, r = n - 1, m = -1;
28
29                while (l <= r) {
30                    int mid = l + (r - l) / 2;
31                    long prod = (long) nums1[i] * nums2[mid];
32
33                    if (prod <= target) {
34                        m = mid;
35                        l = mid + 1;
36                    } else {
37                        r = mid - 1;
38                    }
39                }
40                c += (m + 1);
41            }
42
43            else { // nums1[i] < 0
44                int l = 0, r = n - 1, m = n;
45
46                while (l <= r) {
47                    int mid = l + (r - l) / 2;
48                    long prod = (long) nums1[i] * nums2[mid];
49
50                    if (prod <= target) {
51                        m = mid;
52                        r = mid - 1;
53                    } else {
54                        l = mid + 1;
55                    }
56                }
57                c += (n - m);
58            }
59        }
60        return c;
61    }
62}
63