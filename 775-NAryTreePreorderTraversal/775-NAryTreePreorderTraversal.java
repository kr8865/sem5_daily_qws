// Last updated: 8/26/2025, 9:51:51 PM
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
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }
    
    private void dfs(Node node, List<Integer> res) {
        if (node == null) return;
        
        res.add(node.val); // visit root
        
        for (Node child : node.children) {
            dfs(child, res); // visit each child
        }
    }
}