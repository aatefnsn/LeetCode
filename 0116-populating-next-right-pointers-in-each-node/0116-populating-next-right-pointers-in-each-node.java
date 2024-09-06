/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root); // adding nodes to the queue
        if (root == null){
            return root;
        }
       
        while(!q.isEmpty()){
            int size = q.size();
            Node prev = null;
            while (size > 0){
                Node current=q.remove();
                if (prev != null){
                    prev.next= current;
                }
                prev=current;
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
                size--;
            }
        }
        /*
        Node temp = null; // initializing prev to null
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                Node prev = temp;
                temp = q.poll();
                // i > 0 because when i is 0 prev points
                // the last node of previous level,
                // so we skip it
                if (i > 0){
                    prev.next = temp;
                }
                //System.out.println(temp.val);
                if (temp.left != null){
                    q.add(temp.left);
                }
                if (temp.right != null){
                    q.add(temp.right);
                }
            }
            // pointing last node of the nth level to null
            temp.next = null;
        }*/
        return root;
    }
}