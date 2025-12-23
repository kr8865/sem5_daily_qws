// Last updated: 23/12/2025, 16:42:01
1import java.util.Arrays;
2
3public class Solution {
4    int primes[] = new int[] { 2, 3, 5, 7 };
5    int maxPrime = primes[primes.length - 1];
6
7    public String smallestNumber(String num, long t) {
8        int primeCount[] = new int[maxPrime + 1];
9        int numLength = num.length();
10        int minLength;
11        int firstZeroIndexFromLeft = 0;
12
13        // Calculate the prime factors of t
14        for (int prime : primes) {
15            while (t % prime == 0) {
16                t /= prime;
17                primeCount[prime]++;
18            }
19        }
20
21        // If t is not fully factorizable by the given primes, return -1
22        if (t != 1) {
23            return "-1";
24        }
25
26        // Calculate the minimum length required
27        minLength = getMinLength(primeCount);
28
29        // If num's length is less than the required minimum length, build the smallest number
30        if (numLength < minLength) {
31            return buildSuffix(primeCount, minLength, new char[minLength]);
32        }
33
34        char[] result = new char[numLength + 1];
35
36        for (int i = 0; firstZeroIndexFromLeft < numLength
37                && (result[++i] = num.charAt(firstZeroIndexFromLeft)) != '0'; firstZeroIndexFromLeft++) {
38            logNum(primeCount, result[i], -1);
39        }
40
41        if (getMinLength(primeCount) == 0) {
42            if (firstZeroIndexFromLeft == numLength) {
43                return num;
44            }
45            Arrays.fill(result, ++firstZeroIndexFromLeft, result.length, '1');
46            return new String(result, 1, numLength);
47        }
48
49        for (int last = numLength - 1, end = Math.min(firstZeroIndexFromLeft, last); end >= 0; end--) {
50            for (logNum(primeCount, result[end + 1], 1); ++result[end + 1] <= '9'; logNum(primeCount, result[end + 1], 1)) {
51                logNum(primeCount, result[end + 1], -1);
52                if (getMinLength(primeCount) <= last - end) {
53                    return buildSuffix(primeCount, last - end, result);
54                }
55            }
56        }
57
58        // Build and return the final result
59        return buildSuffix(primeCount, result.length, result);
60    }
61
62    // Update primeCount based on the digit value
63    void logNum(int[] primeCount, int num, int value) {
64        if (num < '2') {
65            return;
66        }
67
68        if (num == '9') {
69            primeCount[3] += value << 1;
70        } else if (num == '4') {
71            primeCount[2] += value << 1;
72        } else if (num == '8') {
73            primeCount[2] += value * 3;
74        } else if (num == '6') {
75            primeCount[2] += value;
76            primeCount[3] += value;
77        } else {
78            primeCount[num - '0'] += value;
79        }
80    }
81
82    // Construct the smallest valid number using the prime factors
83    String buildSuffix(int[] primeCount, int targetLength, char[] result) {
84        int index = result.length;
85
86        while (primeCount[3] > 1) {
87            primeCount[3] -= 2;
88            result[--index] = '9';
89        }
90
91        while (primeCount[2] > 2) {
92            primeCount[2] -= 3;
93            result[--index] = '8';
94        }
95
96        while (primeCount[7]-- > 0) {
97            result[--index] = '7';
98        }
99
100        if (primeCount[2] > 0 && primeCount[3] > 0) {
101            result[--index] = '6';
102            primeCount[2]--;
103            primeCount[3]--;
104        }
105
106        while (primeCount[5]-- > 0) {
107            result[--index] = '5';
108        }
109
110        while (primeCount[2] > 1) {
111            primeCount[2] -= 2;
112            result[--index] = '4';
113        }
114
115        while (primeCount[3] > 0) {
116            primeCount[3]--;
117            result[--index] = '3';
118        }
119
120        while (primeCount[2] > 0) {
121            primeCount[2]--;
122            result[--index] = '2';
123        }
124
125        while (index + targetLength != result.length) {
126            result[--index] = '1';
127        }
128
129        return targetLength == result.length ? new String(result) : new String(result, 1, result.length - 1);
130    }
131
132    // Calculate the minimum length required based on the prime factors
133    int getMinLength(int[] primeCount) {
134        int count2 = Math.max(0, primeCount[2]);
135        int count3 = Math.max(0, primeCount[3]);
136        int count23 = (count3 & 1) + (count2 % 3);
137
138        return (count3 >> 1) + (count2 / 3) + Math.max(0, primeCount[7]) + Math.max(0, primeCount[5])
139                + (count23 == 3 ? 2 : count23 > 0 ? 1 : 0);
140    }
141}