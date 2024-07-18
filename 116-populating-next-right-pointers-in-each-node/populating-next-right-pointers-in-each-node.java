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
        Node current=root;
        Node next_level=null;
        if (current == null){
            return null;
        }else if(current.left != null){
            next_level=current.left;
        }else{
            next_level=null;
        }
        while(current != null && next_level != null){
            current.left.next = current.right;

            if (current.next != null){
                current.right.next=current.next.left;
            }
            current=current.next;
            if(current == null){
                current=next_level;
                next_level=current.left;
            }
        }
return root;
    }
}