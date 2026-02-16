# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
import math
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        l=ListNode()
        if not head:
            return l
        if not head.next:
            return head
        if not head.next.next:
            return head.next
        else:
            count=1
            lp=head
            rp=lp.next
            while rp.next:
                rp=rp.next
                count+=1
        count+=1
        #print("count is ", count)
        hops=math.floor(count/2)
        #print("hops is ", hops)
        while hops > 0 :
            lp=lp.next
            hops=hops-1
        return lp