// Last updated: 7/31/2025, 2:04:15 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        List<Boolean> list=new ArrayList<Boolean>();
        for(int i=1;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int j=0;j<candies.length;j++){
            if(candies[j]+extraCandies>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
        
    }
}