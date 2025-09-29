// Last updated: 9/29/2025, 11:31:53 PM
class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i])){
            map.put(arr[i],1);
        }
        else{
            int v=map.get(arr[i]);
            map.put(arr[i],v+1);
        }
       }
       int max=-1;
       for(int key:map.keySet()){
        int v=map.get(key);
        if(v==key){
            max=Math.max(max,key);
        }
       }
        return max;
    }
}