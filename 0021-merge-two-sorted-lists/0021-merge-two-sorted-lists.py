# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if not list1 and not list2:
            return 
        elif not list1 and list2:
            return list2
        elif not list2 and list1:
            return list1
        else:
            print("2 non empty lists")
            r = ListNode()
            cur = r
            while list1 and list2:
                if list1.val <= list2.val:
                    print("list1 val smaller")
                    cur.val = list1.val
                    list1=list1.next
                    print(r)
                else:
                    print("list2 val smaller")
                    cur.val = list2.val
                    print(r)
                    list2=list2.next
                cur.next=ListNode()
                cur=cur.next
            if list1:
                cur.val=list1.val
                list1=list1.next
                cur.next=list1
            else:
                cur.val=list2.val
                list2=list2.next
                cur.next=list2
                #make a new ListNode, assign it the value
                # set it as either root of the new list or direct existing node .next to the new ListNode
            
        return r
        