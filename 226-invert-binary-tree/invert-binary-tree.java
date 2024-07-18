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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }else{
            LinkedList<TreeNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                //System.out.println(q.size());
                TreeNode curr=q.pop();
                System.out.println(curr.val);

                if (curr.left !=null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);

                if(curr.left != null && curr.right !=null){
                    TreeNode temp=curr.left;
                    curr.left=curr.right;
                    curr.right=temp;
                    //q.add(q.peek().left);
                    //q.add(q.pop().right);
                }else if(curr.left == null && curr.right !=null){
                    curr.left=curr.right;
                    curr.right=null;
                     //q.add(q.pop().right);
                }else if(curr.left != null && curr.right ==null){
                    curr.right=curr.left;
                    curr.left=null;
                     //q.add(q.pop().left);
                }
                
            }
            //
        }
        return root;
    }
}
        //return root;
       /*
    if (root == null){
        return root;
    }else{
        //swap
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        //if (root.left != null){
             invertTree(root.left);
        //}
        //if (root.right != null){
             invertTree(root.right);
        // }
        
        //return root;
        
    }*/