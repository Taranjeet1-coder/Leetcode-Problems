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
    bool isSameTree(TreeNode* p, TreeNode* q) {        
        stack<TreeNode*> s,t;
        s.push(p);
        t.push(q);
        vector<int> ans1;
        vector<int> ans2;
        while(!s.empty() && !t.empty()){
            TreeNode* node1= s.top();
            s.pop();
            TreeNode* node2= t.top();
            t.pop();
            if(node1==NULL && node2== NULL){
                continue;
            }
            if(node1==NULL || node2==NULL){
                return false;
            }            
            if(node1->val != node2->val){
                return false;
            }
            s.push(node1->left);
            t.push(node2->left);
            s.push(node1->right);
            t.push(node2->right);            
        }
        return !s.empty()== !t.empty();
    }
};