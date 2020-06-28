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
    private Map<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;

        for (int i=0;i<n;i++) {
            indexMap.put(inorder[i],i);
        }

        return myBuildTree (preorder,inorder,0,n-1,0,n-1);

    }

    private TreeNode myBuildTree (int[] preorder,int[] inorder,int preorder_left,int preorder_right,int inorder_left,int inorder_right) {

        if (preorder_left > preorder_right) {
            return null;
        }

        int preOrder_root = preorder_left;

        int inOrder_root = indexMap.get(preorder[preOrder_root]);

        TreeNode root = new TreeNode(preorder[preOrder_root]);

        int size_left_subTree = inOrder_root - inorder_left;

        root.left = myBuildTree(preorder, inorder, preorder_left+1, preOrder_root+size_left_subTree, inorder_left,inOrder_root - 1);
        root.right = myBuildTree(preorder, inorder,preorder_left+size_left_subTree+1,preorder_right,inOrder_root+1,inorder_right);

        return root;
    }
}