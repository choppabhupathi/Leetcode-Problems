class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res1= new ArrayList<>();
          List<Integer> res2= new ArrayList<>();
        inorderTraversal(root1, res1);
        inorderTraversal(root2, res2);

        res1.addAll(res2);
        Collections.sort(res1);
        return res1;
    }

     private void inorderTraversal(TreeNode root, List<Integer> res) {
        if (root == null) return;
        inorderTraversal(root.left,res);
        res.add(root.val);
        inorderTraversal(root.right, res);
    }
   }