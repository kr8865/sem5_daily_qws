// Last updated: 7/31/2025, 2:06:54 PM
class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
		int d=prime_sieve(n);
        return d;	
		

	}
	//jis index pr 0 h usko prime number
	public static int prime_sieve(int n) {
		int c=0;
		int[] ans=new int[n];
		ans[0]=ans[1]=1;
		for(int i=2;i*i<=ans.length;i++) {
			if(ans[i]==0) {
				//i prime h
				for(int j=2;i*j<ans.length;j++) {
					ans[i*j]=1;
				}
			}
		}
		for(int k=0;k<ans.length;k++) {
			if(ans[k]!=1) {
				c++;
			}
		}
		return c;
        
    }
}