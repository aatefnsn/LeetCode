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
            count=0
            new_head=ListNode(head.val)
            #print("new head",new_head.val)
            #new_head2=head
            #new_head.next= None
            ans=new_head
            #new_head=new_head.next
            curOdd=head
            #print("curOdd is ", curOdd.val)
            #print("curOdd next should be ", curOdd.next.next.val)
            while curOdd.next and curOdd.next.next:
                curOdd=curOdd.next.next
                print(curOdd.val)
                new_head.next=ListNode(curOdd.val)
                #print("new head ")
                #new_head.next.next= None
                new_head=new_head.next
                
            #print("done with odd")
            curEven=head.next
            if curEven:
                new_head.next=ListNode(curEven.val)
                new_head=new_head.next
                while curEven.next and curEven.next.next:
                    curEven=curEven.next.next
                    new_head.next=ListNode(curEven.val)
                    new_head=new_head.next

                #curEven=head.next
                #print(curEven.val)
                #new_head.next=curEven
                '''
                while curEven.next and curEven.next.next:
                    curEven=curEven.next.next
                    new_head.next=curEven
                    new_head=new_head.next
                '''
        return ans