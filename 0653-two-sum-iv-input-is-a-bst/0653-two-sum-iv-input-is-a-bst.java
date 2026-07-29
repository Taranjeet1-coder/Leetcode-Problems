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
    public boolean findTarget(TreeNode root, int k) {
        // Set<Integer>st=new HashSet<>();
       return dfs(root,root,k);
    }
    public static boolean dfs(TreeNode root,TreeNode curr,int k){
        if(curr==null){
            return false;
        }
        return search(root,curr,k-curr.val) || dfs(root,curr.left,k) || dfs(root,curr.right,k);
    }
    public static boolean search(TreeNode root,TreeNode curr,int k){
        if(root==null){
            return false;
        }
        if(root.val>k){
          return  search(root.left,curr,k);
        }
        else if(root.val<k){
           return search(root.right,curr,k);
        }
        return (root.val==k) && (root!=curr);
    }
}