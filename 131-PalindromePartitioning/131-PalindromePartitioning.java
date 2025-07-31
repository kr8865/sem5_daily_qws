// Last updated: 7/31/2025, 2:07:33 PM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
		List<String> ll=new ArrayList<>();
		partion(s,ll,ans);  
        return ans;
    }
    public static void partion(String ques, List<String> ll,List<List<String>> ans){
        if(ques.length()==0){
        	ans.add(new ArrayList<String>(ll));
            //System.out.println(ans);
            return;
        }
        for(int cut=1;cut<=ques.length();cut++){
            String s=ques.substring(0,cut);
            if(ispalindrome(s)) {
            	ll.add(s);
            partion(ques.substring(cut),ll,ans);
            ll.remove(ll.size()-1);
            }
        }

	}
    public static boolean ispalindrome(String s) {
    	int i=0;
    	int j=s.length()-1;
    	while(i<j) {
    		if(s.charAt(i)!=s.charAt(j)) {
    			return false;
    		}
    		i++;
    		j--;
    	}
    	return true;
    }
}