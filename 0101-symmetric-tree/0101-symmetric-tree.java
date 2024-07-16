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
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        //if (root.left.val == root.right.val){
            return helper(root.left, root.right);
            //retrun true;

        //}
    }
    public boolean helper(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return left==right;
        }
        if (left.val != right.val){
            return false;
        }
        return helper(left.right,right.left) && helper(left.left,right.right);
    }
}

        //will work if the tree is complete
        /*
         if(root==null)  return true;
        Boolean isSymm=true;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        Boolean level_done=false;
        //int count=0;
        while(!q.isEmpty()){
            //System.out.println("count is "+count);
            TreeNode curr=q.pop();
            if(q.size() % 2 == 0){ 
                level_done=true;
            }else{
                level_done=false; //might mean we are not done yet or it means it is not a complete tree so return false
            }
            if(curr.left !=null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
            
            //check if q is symmetric
            if(level_done){    
                System.out.println("Level is done");
                System.out.println("q size is "+q.size());
                int[] q_values=new int[q.size()];
                for(int i=0; i< q.size(); i++){
                    q_values[i]=q.peek().val;
                    q.add(q.pop());
                }
                if(q_values.length % 2 !=0){
                    return false;
                }else{
                    int middle=q_values.length/2;
                    for(int i=0; i<q_values.length/2;i++){
                        if(q_values[i+middle] != q_values[middle-i]){
                            return false;
                        }
                    }
                }*/
                /*
                System.out.println("Array");
                for(int i=0; i< q.size(); i++){
                    System.out.print(q_values[i]);
                }
                System.out.println();
                */
           // }

            /*
            if(q symmetric){
                continue;
            }
            if (q is not symmetric){
                return false;
            }
            
            //if(curr.left.val== curr.right.val){
            //    System.out.println("Equal");
            //}
            
        }
        return true;
        */
   // }
//}