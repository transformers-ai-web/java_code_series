// try submitting this on GfG, here's the link for the problem:
// https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1

/*
class Node {
  public:
    int data;
    Node* left;
    Node* right;

    // Constructor to initialize a new node
    Node(int val) {
        data = val;
        left = NULL;
        right = NULL;
    }
};
*/

class Solution {
  public:
    vector<int> boundaryTraversal(Node *root) {
        // code here
        vector<int>ans;
        if(!isLeaf(root)) ans.push_back(root->data);
        addLeftBoundary(root->left, ans);
        addLeaves(root, ans);
        addRightBoundary(root->right, ans);
        return ans;    
    }
    void addLeftBoundary(Node* root, vector<int> &ans){
        if(root == NULL) return;
        while(root){
            if(!isLeaf(root)) 
                ans.push_back(root->data);
            if(root->left) root = root->left;
            else root=root->right;
            }
    }
    
    void addRightBoundary(Node* root, vector<int> &ans){
        if(root == NULL) return;
        vector<int>temp;
        while(root){
            if(!isLeaf(root)) 
                temp.push_back(root->data);
            if(root->right) root = root->right;
            else root=root->left;
        }
        for(int i  = temp.size()-1;i>=0;i--){
            ans.push_back(temp[i]);
        }
    }
    
    void addLeaves(Node* root, vector<int> &ans){
        if(root==NULL) return;
        
        if(isLeaf(root)) ans.push_back(root->data);
        addLeaves(root->left, ans);
        addLeaves(root->right, ans);
    }
    
    bool isLeaf(Node *root){
        if(root->left == NULL && root->right == NULL)
            return true;
        return false;
    }      
};
