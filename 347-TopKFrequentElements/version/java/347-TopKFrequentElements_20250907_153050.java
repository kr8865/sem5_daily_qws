// Last updated: 9/7/2025, 3:30:50 PM
class Solution {
    static class Pair implements Comparable<Pair>{
        int val;
        int fr;
        Pair(int val,int fr){
            this.val=val;
            this.fr=fr;

        }
        @Override
        public int compareTo(Pair p2){
            return p2.fr-this.fr;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int c=map.get(nums[i]);
                map.put(nums[i],c+1);
            }
        }
        /*for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        } */
       
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
            
        }
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=pq.remove().val;
        }
        return arr;
        
    }
}