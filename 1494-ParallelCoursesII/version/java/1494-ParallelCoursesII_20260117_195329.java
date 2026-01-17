// Last updated: 17/01/2026, 19:53:29
1class Solution {
2    private List<List<Integer>> graph;
3    int []inDegree;
4    int []cache;
5    private void buildGraph(int n, int [][]relations) {
6        for(int i = 0; i < n; i++) {
7            graph.add(new ArrayList<>());
8        }
9        for(int []relation : relations) {
10            int from = relation[0] - 1, to = relation[1] - 1;
11            inDegree[to] += 1;
12            graph.get(from).add(to);
13        }
14    }
15
16    List<List<Integer>> kCombinations;
17    // Generates K combinations for courses
18    private void generateKCombinations(int index, List<Integer> courses, int k, List<Integer> buckets) {
19        if(k >= courses.size()) { kCombinations.add(new ArrayList<>(courses)); return; }
20        if(buckets.size() == k) { kCombinations.add(new ArrayList<>(buckets)); return; }
21        
22        for(int i = index; i < courses.size(); i += 1) {
23            buckets.add(courses.get(i));
24            generateKCombinations(i + 1, courses, k, buckets);
25            buckets.remove(buckets.size() - 1);
26        } 
27    }
28
29    private int minNumberOfSemesters(int currentMask, int []inDegree, int n, int k) {
30        // Base case: none of the courses are available
31        if((currentMask + 1) == (1 << n)) return 0;
32        if(cache[currentMask] != -1) return cache[currentMask];
33        List<Integer> availableCourses = new ArrayList<>();
34        for(int i = 0; i < n; i += 1) {
35            // if course is available and inDegree is 0
36            if(inDegree[i] == 0 && ((currentMask >> i) & 1) == 0) {  availableCourses.add(i); }
37        }
38        int minSemesters = Integer.MAX_VALUE;
39        kCombinations = new ArrayList<>();
40        generateKCombinations(0, availableCourses, k, new ArrayList<>());
41        for(List<Integer> combinations : kCombinations) {
42            int newMask = currentMask;
43            int []newIndegree = new int[n];
44            for(int i = 0; i < n; i += 1) { newIndegree[i] = inDegree[i]; }
45            for(int combination : combinations) {
46                newMask |= (1 << combination);
47                for(int child : graph.get(combination)) {
48                    newIndegree[child] -= 1;
49                }
50            }
51            minSemesters = Math.min(minSemesters, 1 + minNumberOfSemesters(newMask, newIndegree, n, k));
52        }
53        return cache[currentMask] = minSemesters;
54    }
55
56
57
58    public int minNumberOfSemesters(int n, int[][] relations, int k) {
59        graph = new ArrayList<>();
60        inDegree = new int[n];
61        cache = new int[1 << n];
62        Arrays.fill(cache, -1);
63        buildGraph(n, relations);
64        int currentMask = 0; // 0 => all courses are available
65        return minNumberOfSemesters(currentMask, inDegree, n, k);
66    }
67}