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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null) return ans;
        Deque<TreeNode> deq = new LinkedList<>();
        deq.addFirst(root);
        boolean l=true;
        while(!deq.isEmpty()){
            int len = deq.size();
            List<Integer> curr = new ArrayList<>();
            if(l==true){
                for(int i=0;i<len;i++){
                    TreeNode node = deq.removeFirst();
                    if(node.left!=null) deq.addLast(node.left);
                    if(node.right!=null) deq.addLast(node.right);
                    curr.add(node.val);
                }
                l=false;
            }else {
                for(int i=0;i<len;i++){
                    TreeNode node = deq.removeLast();
                    if(node.right!=null) deq.addFirst(node.right);
                    if(node.left!=null) deq.addFirst(node.left);
                    curr.add(node.val);
                }
                l=true;
            }
            ans.add(curr);
        }
        return ans;
    }
}