# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return
        else:
            new_head=ListNode(head.val)
            ans=new_head
            curOdd=head
            while curOdd.next and curOdd.next.next:
                curOdd=curOdd.next.next
                new_head.next=ListNode(curOdd.val)
                new_head=new_head.next

            curEven=head.next
            if curEven:
                new_head.next=ListNode(curEven.val)
                new_head=new_head.next
                while curEven.next and curEven.next.next:
                    curEven=curEven.next.next
                    new_head.next=ListNode(curEven.val)
                    new_head=new_head.next
        return ans