/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {

    
    public boolean hasCycle(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        if (head == null){
            return false;
        }
        while (runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (runner == walker) {
                return true;
            }
            
        }
        return false;
        /*
        ListNode walker = head;
        ListNode runner = head;
        if (head == null){
            return false;
        }
        while (runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (runner == walker) {
                return true;
            }
            
        }
        return false;
        */
    }
}