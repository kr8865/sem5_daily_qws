// Last updated: 7/31/2025, 2:03:57 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int c=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize>=boxTypes[i][0]){
                c+=boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];
            }
            else{
                c+=(truckSize*boxTypes[i][1]);
                truckSize=0;
                break;
            }
        }
        return c;
        
    }
}