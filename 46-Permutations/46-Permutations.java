// Last updated: 7/31/2025, 2:08:23 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
      boolean[] bard=new boolean[nums.length];
        permute(nums,bard,ll,ans);
        return ans;

        
    }
    public static void permute(int[] nums,boolean[] bard,List<Integer> ll,List<List<Integer>> ans){
        if(ll.size()==nums.length){
            ans.add(new ArrayList<>(ll));
            return;


        }
        for(int i=0;i<bard.length;i++){
           
            if(bard[i]==false ){
            ll.add(nums[i]);
            bard[i]=true;
            permute(nums,bard,ll,ans);
            ll.remove(ll.size()-1);
            bard[i]=false;
            }
        }
        }
}