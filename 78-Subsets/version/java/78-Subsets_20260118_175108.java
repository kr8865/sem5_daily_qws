// Last updated: 18/01/2026, 17:51:08
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> ll=new ArrayList<>();
4        List<Integer> l=new ArrayList<>();
5        subset(nums,0,ll,l);
6        return ll;
7        
8    }
9    public static void subset(int[] nums,int idx,List<List<Integer>> ll,List<Integer> l ){
10        if(idx==nums.length){
11            ll.add(new ArrayList<>(l));
12            return;
13        }
14        l.add(nums[idx]);
15        subset(nums,idx+1,ll,l);
16        l.remove(l.size()-1);
17        subset(nums,idx+1,ll,l);
18    }
19}