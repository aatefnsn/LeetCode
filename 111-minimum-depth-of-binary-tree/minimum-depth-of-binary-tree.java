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
    public int minDepth(TreeNode root) {
    if (root == null){
        return 0;
    }
    int level=1;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        int size=q.size();
        for (int i=0; i<size;i++){
            TreeNode curNode=q.poll();
            if(curNode.left==null && curNode.right==null){
                return level;
            }
            if (curNode.right !=null){
                q.add(curNode.right);
            }
            if (curNode.left !=null){
                q.add(curNode.left);
            }
        }
        level++;
    }
    return level;
    }
}