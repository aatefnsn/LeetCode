import math
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return 
        else:
            #int mid=0
            count=1
            head_old=head
            while head.next:
                count+=1
                head=head.next
            if count == 1: 
                return
            else:
                cur=head_old
                #print("cur value is ", cur.val)
                #print("count is ", count)
                mid=math.floor(count/2)
                #print("mid node is ", mid)
                for i in range(mid-1): #if mid =3 i need to stop at 2 so hop 2 times 0 - 1 so 2 hops
                    cur=cur.next
                cur.next=cur.next.next
        return head_old
        