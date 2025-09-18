// Last updated: 9/18/2025, 12:27:34 PM
class Solution {
    public int maxCoins(int[] arr) {
        int []a=new int[arr.length +2];
		a[0]=a[a.length-1]=1;
		int dp[][]=new int[a.length][a.length];
		for(int[] k:dp) {
			Arrays.fill(k, -1);
		}
		for(int i=0;i<arr.length;i++) {
			a[i+1]=arr[i];
		}
		return(burst(a,0,a.length-1,dp));
    }
    public static int burst(int a[],int i,int j ,int dp[][]) {
		if(i+1==j) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int ans=Integer.MIN_VALUE;
		for(int k=i+1;k<j;k++) {
			int left=burst(a,i,k,dp);
			int right=burst(a,k,j,dp);
			int self=a[i]*a[j]*a[k];
			ans=Math.max(left+right+self,ans);
		}
		return dp[i][j]=ans;
		
		
	}
}