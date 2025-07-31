// Last updated: 7/31/2025, 2:07:17 PM
class Solution {
    public String reverseWords(String s) {
		s=s.trim();
		String[] arr=s.split(" +");
		String ans="";
		for(int i=arr.length-1;i>=0;i--) {
			ans=ans+arr[i]+" ";
		}
		return ans.trim();
		  
    }
}