// Last updated: 7/31/2025, 2:05:25 PM
class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int c=1;
        int max1=candyType.length/2;
        for(int i=1;i<=candyType.length-1;i++){
            if(candyType[i-1]!=candyType[i]){
                c++;  
            }
            
        }
        if(c>max1){
            return max1;
        }
        else{
            return c;
        }
        
    }
}