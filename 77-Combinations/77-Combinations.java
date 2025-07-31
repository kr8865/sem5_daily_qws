// Last updated: 7/31/2025, 2:07:59 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] board=new boolean[n];
        combination(n,k,board,ll,ans,0,0);
        return ans;
        
    }
    public static void combination(int n,int k, boolean[] board,List<Integer> ll,List<List<Integer>> ans ,int idx,int qp){
        if(qp==k){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=idx;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                ll.add(i+1);
                combination(n,k,board,ll,ans,i+1,qp+1);
                ll.remove(ll.size()-1);
                board[i]=false;
                
                }
        }




    }
}