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
    public int countNodes(TreeNode root) {
        return inorder(root, new int[1]);
    }
    private int inorder(TreeNode root, int[] arr){
        if(root==null)return arr[0];
        inorder(root.left,arr);
        arr[0]++;
        inorder(root.right,arr);
        return arr[0];
    }
    
}