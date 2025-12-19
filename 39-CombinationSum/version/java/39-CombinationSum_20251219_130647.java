// Last updated: 19/12/2025, 13:06:47
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> ans=new ArrayList<>();
4        List<Integer> ll=new ArrayList<>();
5        sum( candidates,target,ans,ll,0,0);
6        return ans;
7    }
8    public static void sum(int[] candidates,int target,List<List<Integer>> ans,List<Integer> ll,int sum,int v){
9        if(target==sum){
10            ans.add(new ArrayList(ll));
11            return ;
12        }
13        if(sum>target){
14            return;
15        }
16
17
18        for(int i=v;i<candidates.length;i++){
19            ll.add(candidates[i]);
20            sum(candidates,target,ans,ll,sum+candidates[i],i);
21            ll.remove(ll.size()-1);
22
23            
24        }
25
26
27
28
29
30
31    }
32}