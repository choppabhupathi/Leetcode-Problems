class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root!=null){
            if((root == p || root == q) || (root.val > p.val && root.val < q.val) || (root.val < p.val && root.val > q.val)) return root;
            if(root.val>p.val && root.val>q.val){
                root = root.left;
            }else if(root.val<p.val && root.val<q.val){
                root = root.right;
            }
        }
        return root;
    }
}