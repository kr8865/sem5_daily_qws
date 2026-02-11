// Last updated: 11/02/2026, 20:44:29
1class Solution {
2    
3    class Pair {
4        int si;
5        int ei;
6        Pair(int si, int ei) {
7            this.si = si;
8            this.ei = ei;
9        }
10    }
11
12    public int[][] merge(int[][] intervals) {
13
14        if (intervals.length <= 1) {
15            return intervals;
16        }
17
18        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
19
20        ArrayList<Pair> ll = new ArrayList<>();
21
22        int si = intervals[0][0];
23        int ei = intervals[0][1];
24
25        for (int i = 1; i < intervals.length; i++) {
26
27            int nsi = intervals[i][0];
28            int nei = intervals[i][1];
29
30            if (ei >= nsi) {
31                // merge
32                ei = Math.max(ei, nei);
33            } else {
34                // no overlap → store previous interval
35                ll.add(new Pair(si, ei));
36                si = nsi;
37                ei = nei;
38            }
39        }
40
41        // add last interval
42        ll.add(new Pair(si, ei));
43
44        int[][] ans = new int[ll.size()][2];
45
46        for (int i = 0; i < ll.size(); i++) {
47            Pair p = ll.get(i);
48            ans[i][0] = p.si;
49            ans[i][1] = p.ei;
50        }
51
52        return ans;
53    }
54}
55