// try submitting this on leetcode, here's the link for the problem
// https://leetcode.com/problems/same-tree/
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null) {
            if(p==q) return true;
            else return false;
        }
        if(p.val != q.val) return false;
        return true && (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}