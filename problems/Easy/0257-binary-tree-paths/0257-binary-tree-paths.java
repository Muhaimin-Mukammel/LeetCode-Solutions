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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<String>();
        if(root != null) backtrack(root, "", ans);
        return ans;
    }

    void backtrack(TreeNode root, String path, List<String> answer){
        if(root.right == null && root.left == null) answer.add(path + root.val);
        if(root.right != null) backtrack(root.right, path + root.val + "->", answer);
        if(root.left != null) backtrack(root.left, path + root.val + "->", answer);
    }
}