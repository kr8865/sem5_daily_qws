// Last updated: 8/17/2025, 10:26:32 AM
class Solution {
    public int maxBalancedShipments(int[] weight) {
        int i=0;
        int j=0;
        int s=0;
        int max=-1;
        while(i <weight.length && j<weight.length){
            max=Math.max(max,weight[j]);
            int last=weight[j];
            if(max>last){
                max=0;
                s++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        
        return s;
    }
}