class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);        
    }

    private int dfs(TreeNode node, int num) {
        if (node == null) {
            return 0;
        }
        
        num = num * 10 + node.val;
        
        if (node.left == null && node.right == null) {
            return num;
        }
        
        return dfs(node.left, num) + dfs(node.right, num);
    }    
}