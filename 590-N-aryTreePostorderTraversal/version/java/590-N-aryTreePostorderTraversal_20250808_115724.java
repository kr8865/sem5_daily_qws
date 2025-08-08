// Last updated: 8/8/2025, 11:57:24 AM
// nary postorder
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> res=new ArrayList<>();
        post(root,res);
        return res;
        
    }
    public static void post(Node root,List<Integer> res){
        if(root==null){
            return;
        }
        for(Node child : root.children){
            post(child,res);
        }
        res.add(root.val);
    }
}