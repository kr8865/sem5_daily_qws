// Last updated: 10/17/2025, 8:05:47 PM
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
       
        view(root,0,ll);
        return ll;
        
    }
    private int maxd=0;
    public void view(TreeNode root,int cl,List<Integer> ll){
        if(root==null){
            return;
        }
        if(ll.size()==cl){
            ll.add(root.val);

            
            
        }
        view(root.right,cl+1,ll);
        view(root.left,cl+1,ll);
        
    }
}
