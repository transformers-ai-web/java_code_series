// try submitting this on gfg, here's the link for the problem
// https://practice.geeksforgeeks.org/problems/floor-in-bst/1


/*
class Node {
public:
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = right = NULL;
    }
};
*/

class Solution {
  public:
    int floor(Node* root, int x) {
        // code here
        Node *curr = root;
        int floorVal = -1;
        while(root){
            if(root->data == x){
                floorVal =  root->data;
                break;
            }
            else if(root->data < x){
                floorVal = root->data;
                root = root->right;
            }
            else
                root = root->left;
            
        }
        return floorVal;
    }
};