// Last updated: 7/31/2025, 2:07:36 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] min=new int[n];
        int[] max=new int[n];
        int prof=0;
        min[0]=prices[0];
        int min_val=min[0];
        int max_val=prices[n-1];
        for(int i=1;i<n;i++){
            min_val=Math.min(min_val,prices[i]);
            min[i]=min_val;
        }
        max[n-1]=prices[n-1];
        for(int j=n-2;j>=0;j--){
            max_val=Math.max(max_val,prices[j]);
            max[j]=max_val;

        }
        for(int k=0;k<n;k++){
            int value=max[k]-min[k];
            prof=Math.max(prof,value);
        }
        return prof;

    }
}
