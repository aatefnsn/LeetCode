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
        if (root == null) {
            return null;
        } else {
            LinkedList<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int size = q.size();
                    for (int i = 0; i < size; i++) {
                        Node current = q.pop();
                        if (i < size - 1) {
                            current.next = q.peek();
                        }
                        if (current.left != null) {
                        q.add(current.left);
                    }
                    if (current.right != null) {
                        q.add(current.right);
                    }
                    }
            }
        }
        return root;
    }

    public Node connect0(Node root) {
        Node current = root;
        Node next_level = null;
        if (current != null) {
            next_level = current.left;
        } else {
            next_level = null;
        }
        while (current != null && next_level != null) {
            current.left.next = current.right;
            if (current.next != null) {
                current.right.next = current.next.left;
            }
            current = current.next;
            if (current == null) {
                current = next_level;
                next_level = current.left;
            }
        }
        return root;
    }

    public Node connect1(Node root) {
        // solutin without queues, only works on perfect complete binary tree
        Node current = root;
        Node next = null;
        if (current != null) { // can be if (root != null && current.left ! = null){
            next = current.left;
        } else {
            next = null;
        }
        while (current != null && next != null) { // current and current.left are not null
            current.left.next = current.right;
            if (current.next != null) {
                current.right.next = current.next.left;
            }
            current = current.next;
            if (current == null) {
                current = next;
                next = current.left;
            }
        }
        return root;
    }

    public Node connect2(Node root) {
        // Solution generic works for both 116 and 117
        if (root == null)
            return root;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                if (i < size - 1)
                    cur.next = q.peek();
                else
                    cur.next = null;
                if (cur.left != null)
                    q.add(cur.left);
                if (cur.right != null)
                    q.add(cur.right);
            }
        }
        return root;
    }

    public Node connect3(Node root) {
        // my own solution solution 2
        Queue<Node> q = new LinkedList<>();
        q.add(root); // adding nodes to the queue
        if (root == null) {
            return root;
        }
        while (!q.isEmpty()) {
            int size = q.size();
            Node prev = null;
            while (size > 0) {
                Node current = q.remove();
                if (prev != null) {
                    prev.next = current;
                }
                size--;
                prev = current;
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
                // size--;
            }
        }
        return root;
    }
}