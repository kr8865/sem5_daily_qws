// Last updated: 8/8/2025, 11:46:22 AM
// tree
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> ll=new HashMap<>();
        inorder(root,ll);
        int maxFreq = 0;
        for (int freq : ll.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }

        // Step 2: collect all keys with max frequency
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : ll.entrySet()) {
            if (e.getValue() == maxFreq) {
                modes.add(e.getKey());
            }
        }

        // Step 3: convert to int[]
        int[] res = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            res[i] = modes.get(i);
        }
        return res;
    }
        
        
    
    public static void inorder(TreeNode root, HashMap<Integer,Integer> ll ){
        if(root==null){
            return;
        }
        inorder(root.left,ll);
        if(ll.containsKey(root.val)){
            ll.put(root.val ,ll.get(root.val)+1);
        }
        else{
            ll.put(root.val,0);
        }
        inorder(root.right,ll);
    
    }
}