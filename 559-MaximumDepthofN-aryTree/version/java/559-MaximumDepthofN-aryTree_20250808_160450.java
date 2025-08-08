// Last updated: 8/8/2025, 4:04:50 PM
// max_depth_nary_tree
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}
*/

class Solution {
    public int maxDepth(Node root) {
        if (root == null) return 0;

        int max = 0;
        for (Node child : root.children) {
            max = Math.max(max, maxDepth(child));
        }
        return max + 1;
    }
}
