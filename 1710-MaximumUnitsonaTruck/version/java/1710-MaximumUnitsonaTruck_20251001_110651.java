// Last updated: 10/1/2025, 11:06:51 AM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes,(a,b)->a[1]-b[1]);
        int c=0;
        for(int i=boxTypes.length-1;i>=0;i--){
            if((truckSize-boxTypes[i][0])>0){
                c+=(boxTypes[i][1]*boxTypes[i][0]);
                truckSize-=boxTypes[i][0];

            }
            else{
                c+=truckSize*boxTypes[i][1];
                break;
            }
        }
        return c;
        
    }
}