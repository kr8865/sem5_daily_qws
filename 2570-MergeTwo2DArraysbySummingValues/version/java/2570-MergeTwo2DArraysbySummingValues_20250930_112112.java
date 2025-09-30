// Last updated: 9/30/2025, 11:21:12 AM
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
                map.put(nums1[i][0],nums1[i][1]);

        }
        for(int i=0;i<nums2.length;i++){
            if(!map.containsKey(nums2[i][0])){
                map.put(nums2[i][0],nums2[i][1]);
            }
            else{
                int v=map.get(nums2[i][0]);
                map.put(nums2[i][0],v+nums2[i][1]);
            }
        }
        int[][] res=new int[map.size()][2];
        int i=0;
        for(int key:map.keySet()){
            res[i][0]=key;
            res[i][1]=map.get(key);
            i++;
            
        }
        Arrays.sort(res,(a,b)->a[0]-b[0]);
        return res;
    }
}