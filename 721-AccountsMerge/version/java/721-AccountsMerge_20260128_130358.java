// Last updated: 28/01/2026, 13:03:58
1class Solution {
2    class DisjointSet {
3        int[] parent, rank;
4        DisjointSet(int n) {
5            parent = new int[n];
6            rank = new int[n];
7            for (int i = 0; i < n; i++) parent[i] = i;
8        }
9        int findUltimateParent(int node) {
10            if (parent[node] == node) return node;
11            return parent[node] = findUltimateParent(parent[node]); // Path Compression
12        }
13        void unionByRank(int u, int v) {
14            int pu = findUltimateParent(u);
15            int pv = findUltimateParent(v);
16            if (pu == pv) return;
17            if (rank[pu] < rank[pv]) parent[pu] = pv;
18            else if (rank[pv] < rank[pu]) parent[pv] = pu;
19            else {
20                parent[pv] = pu;
21                rank[pu]++;
22            }
23        }
24    }
25
26    public List<List<String>> accountsMerge(List<List<String>> accounts) {
27        int n = accounts.size();
28        DisjointSet ds = new DisjointSet(n);
29        HashMap<String, Integer> map = new HashMap<>();
30
31        // Map emails to account indices and union connected accounts
32        for (int i = 0; i < n; i++) {
33            for (int j = 1; j < accounts.get(i).size(); j++) {
34                String mail = accounts.get(i).get(j);
35                if (map.containsKey(mail)) {
36                    ds.unionByRank(i, map.get(mail));
37                } else {
38                    map.put(mail, i);
39                }
40            }
41        }
42
43        // Group emails by their ultimate parent index
44        ArrayList<String>[] mergedMail = new ArrayList[n];
45        for (int i = 0; i < n; i++) mergedMail[i] = new ArrayList<>();
46        for (Map.Entry<String, Integer> it : map.entrySet()) {
47            int node = ds.findUltimateParent(it.getValue());
48            mergedMail[node].add(it.getKey());
49        }
50
51        // Format the result: Sort emails and add account names
52        List<List<String>> result = new ArrayList<>();
53        for (int i = 0; i < n; i++) {
54            if (mergedMail[i].isEmpty()) continue;
55            Collections.sort(mergedMail[i]);
56            List<String> temp = new ArrayList<>();
57            temp.add(accounts.get(i).get(0)); // Get name from original account
58            temp.addAll(mergedMail[i]);
59            result.add(temp);
60        }
61        return result;
62    }
63}