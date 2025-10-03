from collections import deque
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        stack1=deque()
        l1=[]
        stack2=deque()
        l2=[]
        if not root1 and not root2:
            return False
        else:
            stack1.appendleft(root1)
            stack2.appendleft(root2)
            while stack1:
                cur1=stack1.popleft()
                if cur1.left:
                    stack1.appendleft(cur1.left)
                if cur1.right:
                    stack1.appendleft(cur1.right)
                if not cur1.left and not cur1.right:
                    print("leaf node at root 1 ", cur1.val)
                    l1.append(cur1.val)
            
            while stack2:
                cur2=stack2.popleft()
                if cur2.left:
                    stack2.appendleft(cur2.left)
                if cur2.right:
                    stack2.appendleft(cur2.right)
                if not cur2.left and not cur2.right:
                    print("leaf node at root 2 ", cur2.val)
                    l2.append(cur2.val)
            #print("l1 is ", l1)
            #print("l2 is ", l2)
            return True if l1 == l2 else False