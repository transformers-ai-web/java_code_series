// try submitting this on leetcode, here's the link for the problem
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>answer = new ArrayList<>();
        if(root==null) return answer;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int flag = 0;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
                level.add(curr.val);
            }
            if(flag%2!=0){
                Collections.reverse(level);
            }
            answer.add(level);
            flag++;
        }
        return answer; 
        
    }
}