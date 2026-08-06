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

//  1st method  complexity- o(n)
// class Solution {
//     public int countNodes(TreeNode root) {
//         if(root==null){
//             return 0;
//         } 
//         return 1+ countNodes(root.left) + countNodes(root.right);
//     }
// }

//  2nd method complexity- (log n)^2
class Solution {
    public int leftheight(TreeNode root){
        int h=0;
        while(root!=null){
            root= root.left;
            h++;
        }
        return h;
    }
    public int rightheight(TreeNode root){
        int h=0;
        while(root!=null){
            root= root.right;
            h++;
        }
        return h;
    }
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        } 
        int lh = leftheight(root);
        int rh= rightheight(root);
        if(lh==rh){
            return (1<<lh) -1;
        }
        return 1+ countNodes(root.left) + countNodes(root.right);
    }
}