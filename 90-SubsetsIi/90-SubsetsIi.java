// Last updated: 7/31/2025, 2:07:46 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        subset(ll,ans,nums,0);
        return ans;   
        
    }
    public static void subset(List<Integer> ll,List<List<Integer>>ans,int[] nums,int idx ){
      if(idx==nums.length){
        ans.add(new ArrayList<>(ll));
        return;
      }
    
        
       
            
            ll.add(nums[idx]);
            subset(ll,ans,nums,idx+1);
            
            while(idx+1<nums.length && nums[idx]==nums[idx+1]){
                idx++;
            }
            ll.remove(ll.size()-1);
            subset(ll,ans,nums,idx+1);
        
    }
}