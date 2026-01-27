// try submitting this on gfg, here's the link for the problem
// https://practice.geeksforgeeks.org/problems/ceil-in-bst/1

/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        int ceilValue = -1;

        while (root != null) {
            if (root.data == x) {
                ceilValue = root.data;
                break;
            } 
            else if (root.data > x) {
                ceilValue = root.data;
                root = root.left;
            } 
            else {
                root = root.right;
            }
        }

        return ceilValue;
    }
}
