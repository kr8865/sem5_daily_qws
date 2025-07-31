// Last updated: 7/31/2025, 2:06:40 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> ll=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int c=hm.get(nums[i]);
                hm.put(nums[i],c+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
       Set<Integer> keySet= hm.keySet();
       for(Integer key:keySet){
        if(hm.get(key)>nums.length/3){
            ll.add(key);
        }
       }
       return ll; 
    }
}