// Last updated: 7/31/2025, 2:08:40 PM
class Solution {
    public List<String> generateParenthesis(int n) {
		List<String> ll=new ArrayList<>();
		paranteheisis(n,0,0,"",ll);
        return ll;
	}
	public static void paranteheisis(int n,int closed,int open,String ans,List<String> ll ) {
		if(open==n && closed==n) {
			ll.add(ans);
			return;
		}
	if(open>n || closed>open) {
		return;
	}
	paranteheisis(n,closed,open+1,ans+"(",ll);
	paranteheisis(n,closed+1,open,ans+")",ll);
	}
}
