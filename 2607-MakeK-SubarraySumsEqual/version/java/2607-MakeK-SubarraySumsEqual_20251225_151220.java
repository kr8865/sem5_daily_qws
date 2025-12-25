// Last updated: 25/12/2025, 15:12:20
1class Solution {
2    public long makeSubKSumEqual(int[] arr, int k) {
3
4        if(k > arr.length) return minMove(Arrays.asList(Arrays.stream( arr ).boxed().toArray( Integer[]::new )));
5        int len = arr.length;
6        int flag[] = new int[arr.length];
7        Arrays.fill(flag,0);
8
9
10        List<Integer> temp = new ArrayList<>();
11        long min =0;
12        for(int i=0;i<k;i++)
13        {
14            if(flag[i] == 1) continue;
15            int j=i;
16            while(flag[j] == 0)
17            {
18                temp.add(arr[j]);
19                flag[j] = 1;
20                j = (j+k)%len;
21            }
22            min += (long)minMove(temp);
23            temp = new ArrayList<>();
24        }
25
26        return min;
27
28    }
29
30
31    public long minMove(List<Integer> arr) {
32        long res =0;
33        Collections.sort(arr);
34        Integer median = arr.get(arr.size()/2);
35        for(Integer x:arr) res+= Math.abs(x - median);
36        return res;
37    }
38}