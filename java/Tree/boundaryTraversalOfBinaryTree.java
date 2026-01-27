//try submitting this on GFG, here's the link for the problem
//https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1

/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) return ans;

        // Add root if it's not a leaf
        if (!isLeaf(root)) {
            ans.add(root.data);
        }

        // Left boundary
        addLeftBoundary(root.left, ans);

        // Leaves
        addLeaves(root, ans);

        // Right boundary
        addRightBoundary(root.right, ans);

        return ans;
    }

    private void addLeftBoundary(Node node, ArrayList<Integer> ans) {
        while (node != null) {
            if (!isLeaf(node)) {
                ans.add(node.data);
            }
            if (node.left != null) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
    }

    private void addRightBoundary(Node node, ArrayList<Integer> ans) {
        ArrayList<Integer> temp = new ArrayList<>();

        while (node != null) {
            if (!isLeaf(node)) {
                temp.add(node.data);
            }
            if (node.right != null) {
                node = node.right;
            } else {
                node = node.left;
            }
        }

        // Add in reverse order
        for (int i = temp.size() - 1; i >= 0; i--) {
            ans.add(temp.get(i));
        }
    }

    private void addLeaves(Node node, ArrayList<Integer> ans) {
        if (node == null) return;

        if (isLeaf(node)) {
            ans.add(node.data);
            return;
        }

        addLeaves(node.left, ans);
        addLeaves(node.right, ans);
    }

    private boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }
}