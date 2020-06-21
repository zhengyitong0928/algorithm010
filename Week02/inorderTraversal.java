/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        LinkedList<Integer> output = new LinkedList<>();
        helper(root,output);
        return output;

    }
    private void helper(TreeNode node ,List<Integer> res) {
        if (node != null && node.left != null) {
            helper(node.left,res);
        }
        if (node != null) {
            res.add(node.val);
        }
        if (node !=null && node.right != null) {
            helper(node.right,res);
        }
    }
}