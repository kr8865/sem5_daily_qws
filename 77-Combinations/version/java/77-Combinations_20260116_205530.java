// Last updated: 16/01/2026, 20:55:30
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> l=new ArrayList<>();
4        List<Integer> ll=new ArrayList<>();
5        combination(0,k,l,ll,0,n);
6        return l;
7    }
8    public static void combination(int i,int k,List<List<Integer>> l,List<Integer> ll,int s,int n){
9        if(s==k){
10            l.add(new ArrayList<>(ll));
11            return;
12
13        }
14
15        for(int ii=i+1;ii<=n;ii++){
16            ll.add(ii);
17            combination(ii,k,l,ll,s+1,n);
18            ll.remove(ll.size()-1);
19        }
20    }
21}