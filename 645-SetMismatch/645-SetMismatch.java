// Last updated: 7/31/2025, 2:05:15 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(map.containsKey(val)){
                int d=map.get(val);
                map.put(val,d+1);
            }
            else{
                map.put(val,1);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(map.containsKey(i)){
                if(map.get(i)==2){
                    result[0]=i;
                }
            }
            else{
                result[1]=i;
            }

        }
        return result;
    }
}