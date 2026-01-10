// Last updated: 10/01/2026, 13:04:54
1class Solution {
2    public int[] avoidFlood(int[] rains) {
3
4        int n = rains.length;
5        int[] ans = new int[n];
6
7        // lake -> last rain index
8        HashMap<Integer, Integer> set = new HashMap<>();
9
10        // dry day indices (sorted)
11        TreeSet<Integer> set2 = new TreeSet<>();
12
13        for (int i = 0; i < n; i++) {
14
15            // 🌞 dry day
16            if (rains[i] == 0) {
17                set2.add(i);
18                ans[i] = 1; // default, baad me change ho sakta hai
19            }
20
21            // 🌧 rain day
22            else {
23                ans[i] = -1;
24                int lake = rains[i];
25
26                // agar lake pehle se bhara hua hai
27                if (set.containsKey(lake)) {
28
29                    int lastIdx = set.get(lake);
30
31                    // uske baad ka pehla dry day chahiye
32                    Integer idx = set2.higher(lastIdx);
33                    if (idx == null) {
34                        return new int[0]; // flood unavoidable
35                    }
36
37                    ans[idx] = lake;   // us din lake dry karo
38                    set2.remove(idx);
39                }
40
41                // update last rain index
42                set.put(lake, i);
43            }
44        }
45        return ans;
46    }
47}
48