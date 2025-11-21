// Last updated: 21/11/2025, 12:42:15
class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            for(int j=0;j<edges[0].length;j++){
                if(!map.containsKey(edges[i][j])){
                    map.put(edges[i][j],1);
                }
                else{
                    int c=map.get(edges[i][j]);
                    map.put(edges[i][j],c+1);
                }
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>1){
                return key;
            }
        }
        return -1;

        
    }
}