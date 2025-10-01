# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        l=[]
        pointer=head
        if not head:
            return 0
        else:
            count=0
            while pointer:
                l.append(pointer.val)
                count+=1
                pointer=pointer.next
            #print(l)
            #print("count is ", count)
            max=0
            for i in range (int(count/2)): # 0 - 1 so 2 iterations if count/2 is 4/2=2
                sum=l[i]+l[len(l)-i-1] # l[0] + l[4-0-1]
                if sum > max:
                    max=sum
            return max




        '''
        rightPointer = head
        leftPointer = head
        if not head:
            return 0
        else:
            count=1
            while rightPointer.next:
                count+=1
                rightPointer=rightPointer.next
            print("count is ", count)
            print("right pointer is now at", rightPointer.val)
        
            for i in range (count/2): # 0 1 (4/2=2 not inclusive then 0 and 1 so 2 iterations)
                sum=leftPointer.val+rightPointer.val
                leftPointer=leftPointer.next


        return 0
        '''

        