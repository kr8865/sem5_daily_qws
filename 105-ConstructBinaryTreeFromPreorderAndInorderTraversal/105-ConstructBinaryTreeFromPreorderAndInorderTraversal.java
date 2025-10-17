// Last updated: 10/17/2025, 8:06:51 PM
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createtree(inorder,preorder,0,inorder.length-1,0,preorder.length-1);
    }
    //ilo=low of inorder ,ihi high of inorder ,plo=low of preorder
    public TreeNode createtree(int[] in,int[] pre,int ilo,int ihi,int plo,int phi){
        if(ilo>ihi || plo>phi){
            return null;
        }
        TreeNode node=new TreeNode(pre[plo]);
        int idx=search(in,ilo,ihi,pre[plo]);
        int c=idx-ilo; //count elements in left in inorder
        node.left=createtree(in,pre,ilo,idx-1,plo+1,plo+c);
        node.right=createtree(in,pre,idx+1,ihi,plo+c+1,phi);
        return node;
    }
    public int search(int[] in,int ilo,int ihi,int item){
        for(int i=ilo;i<=ihi;i++){
            if(in[i]==item ){
                return i;
            }
        }
        return 0;
    }
}