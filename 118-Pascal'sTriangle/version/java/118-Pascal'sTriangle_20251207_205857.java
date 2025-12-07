// Last updated: 07/12/2025, 20:58:57
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> ll = new ArrayList<>();
4
5        for(int i = 0; i < numRows; i++){
6            List<Integer> row = new ArrayList<>();
7            
8            // first and last element is always 1
9            for(int j = 0; j <= i; j++){
10                if(j == 0 || j == i){
11                    row.add(1);
12                } else {
13                    int val = ll.get(i-1).get(j-1) + ll.get(i-1).get(j);
14                    row.add(val);
15                }
16            }
17            ll.add(row);
18        }
19        return ll;
20    }
21}
22