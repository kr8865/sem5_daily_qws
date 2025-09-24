// Last updated: 9/24/2025, 10:12:04 PM
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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<VP> q = new LinkedList<>();
        TreeMap<Integer, List<VP>> map = new TreeMap<>();
        q.add(new VP(root,0,0));
        while(!q.isEmpty()){
            VP vp = q.poll();
            if(!map.containsKey(vp.v)){
                map.put(vp.v, new ArrayList<>());
            } 
            map.get(vp.v).add(vp);

            if(vp.node.left!=null){
                q.add(new VP(vp.node.left, vp.l+1, vp.v-1));
            }

            if(vp.node.right!=null){
                q.add(new VP(vp.node.right, vp.l+1, vp.v+1));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int key : map.keySet()){
            List<VP> ll = map.get(key);
            Collections.sort(ll,new Comparator<VP>() {
                @Override
                public int compare(VP o1, VP o2){
                    if(o1.l == o2.l){
                        return o1.node.val-o2.node.val;
                    }
                    return 0;
                }
            });

            List<Integer> list = new ArrayList<>();

            for(VP v : ll){
                list.add(v.node.val);
            }

            ans.add(list);
        }

        return ans;
    }

    class VP{
        TreeNode node;
        int l; //row
        int v; //col
        public VP(TreeNode node,int l,int v){
            this.l = l;
            this.v = v;
            this.node = node;
        }
    }
}