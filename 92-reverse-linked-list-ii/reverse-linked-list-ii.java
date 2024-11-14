/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy= new ListNode(0,head);
        ListNode leftPrev= dummy;
        ListNode cur= head;
        //leftPrev=dummy;
        //cur=head;

        for (int i=0; i< left-1; i++){
            leftPrev=cur;
            cur=cur.next;
        }
        //System.out.println(cur.val);

        ListNode prev=null;
        ListNode tempNext= new ListNode(0);
        for (int j=0; j< right - left +1; j++){
            tempNext=cur.next;
            cur.next=prev;
            prev=cur;
            cur=tempNext;
        }
        System.out.println(prev.val); //4
        System.out.println(leftPrev.val); //1
        System.out.println(leftPrev.next.val); //2
        
        
        leftPrev.next.next=cur;
        leftPrev.next=prev;



        return dummy.next;
    }
}