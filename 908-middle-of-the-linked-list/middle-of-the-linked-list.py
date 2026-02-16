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
        #print("left pointer is at ", lp.val)
        #print("right pointer is at ", rp.val)
        print("count is ", count)
        
        i=0
        hops=0
        if count%2 != 0: #odd
            print("odd count")
            hops=math.floor(count/2)
            print("hops is ", hops)
            while hops > 0 :
                lp=lp.next
                hops=hops-1
            return lp
        #while rp != lp and lp.next !=rp:
        #    lp=
        else:
            print("even count")
            hops=math.floor(count/2)
            while hops > 0:
                #i+=1
                hops=hops-1
                lp=lp.next
            return lp
        #return l