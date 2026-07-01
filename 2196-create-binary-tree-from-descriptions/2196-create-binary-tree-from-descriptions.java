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
    public TreeNode createBinaryTree(int[][] descriptions) {
       Map<Integer,TreeNode> map=new HashMap<>();
       Set<Integer> set=new HashSet<>();
       for(int[] d:descriptions){
          int par=d[0];
          int child=d[1];
          int left=d[2];
          map.putIfAbsent(par,new TreeNode(par));
          map.putIfAbsent(child,new TreeNode(child));
          if(left==1){
            map.get(par).left=map.get(child);
          }
          else{
            map.get(par).right=map.get(child);
          }
          set.add(child);
        }
          for(int[] d : descriptions){
            if(!set.contains(d[0])){
                return map.get(d[0]);
            }
          }
       

       return null;
    }
}