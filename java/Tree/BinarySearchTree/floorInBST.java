// try submitting this on gfg, here's the link for the problem
// https://practice.geeksforgeeks.org/problems/floor-in-bst/1

/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int floor(Node root, int x) {
        int floorVal = -1;

        while (root != null) {
            if (root.data == x) {
                floorVal = root.data;
                break;
            } 
            else if (root.data < x) {
                floorVal = root.data;
                root = root.right;
            } 
            else {
                root = root.left;
            }
        }

        return floorVal;
    }
}
