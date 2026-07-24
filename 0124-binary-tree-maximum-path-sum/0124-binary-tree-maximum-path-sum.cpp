/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int findMax(TreeNode * node , int & maxSum) {
        if (node == NULL) {
            return 0;
        }
        int left = findMax(node -> left , maxSum);
        int right = findMax(node -> right , maxSum);
        left = max(left , 0);
        right = max(right , 0);
        maxSum = max(maxSum , node -> val + left + right);
        return node -> val + max(left , right);
    }
    int maxPathSum(TreeNode* root) {
        if (root == NULL) {
            return 0;
        }
        int maxSum = INT_MIN;
        findMax(root , maxSum);
        return maxSum;
        
    }
};
// class Solution {
// public:
//     int maxsum=INT_MIN;
//     int dfs(TreeNode* root){
//         if(root== NULL){
//             return 0;
//         }
//         int left= max(0, dfs(root->left));
//         int right= max(0, dfs(root->right));
//         maxsum= max(maxsum, left+ right+ root->val);
//         return root->val + max(left,right);
//     }
//     int maxPathSum(TreeNode* root) {
//         dfs(root);
//         return maxsum;
//     }
// };