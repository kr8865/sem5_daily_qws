// Last updated: 7/31/2025, 2:06:49 PM
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        int[] arr=new int[9];
        for(int i=0;i<9;i++){
            arr[i]=i+1;

        }
        combination(ans,ll,arr,0,k,n);


return ans;

    }
    public static void combination(List<List<Integer>> ans,List<Integer> ll,int[]arr,int idx,int k,int n){
        if(n==0 && ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }


        for(int i=idx;i<arr.length;i++){
            ll.add(arr[i]);
            combination(ans,ll,arr,i+1,k,n-arr[i]);
            ll.remove(ll.size()-1);
        }
    }
}