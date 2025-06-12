class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null)
            return true;

        return isSame(p,q);
    }

    public static boolean isSame(TreeNode p,TreeNode q){
        if(p==null && q==null)
            return true;

        if((p==null || q==null) || (p.val!=q.val))
            return false;

        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }
}