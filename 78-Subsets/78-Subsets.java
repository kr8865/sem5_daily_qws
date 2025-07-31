// Last updated: 7/31/2025, 2:07:58 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        subset(nums,ll,ans,0);
        return ans;
        
    }
    public static void subset(int[] nums ,List<Integer>ll,List<List<Integer>> ans,int idx){
        if(idx==nums.length){
		ans.add(new ArrayList<>(ll));
        return;
        }
			
			

		subset(nums,ll,ans,idx+1);
        ll.add(nums[idx]);
		subset(nums, ll, ans, idx+1);
        ll.remove(ll.size()-1);
		
    }
}