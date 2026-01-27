// try submitting this on gfg, here's the link for the problem
// https://practice.geeksforgeeks.org/problems/ceil-in-bst/1

class Solution {
  public:
    int findCeil(Node* root, int x) {
        // code here
        int ceilValue = -1;
        Node *curr = root;
        while(root){
            if(root->data == x){
                ceilValue = root->data;
                break;
            }
            else if(root->data > x){
                ceilValue = root->data;
                root = root->left;
            }
            else
                root= root->right;
        }
        return ceilValue;
    }
};
