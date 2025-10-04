from collections import deque
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        stack=deque()
        visited=[]
        if not root:
            return 0
        else:
            count=1
            stack.appendleft((root, root.val)) # push the node and the max value along the path
            while stack:
                cur, curMax=stack.popleft()
                #print("cur value is ",cur.val)
                #print("cur max along the path is ",curMax)
                visited.append(cur)
                if cur.left:
                    stack.appendleft((cur.left, max(cur.left.val,curMax)))
                    if cur.left.val >= curMax:
                        count+=1
                if cur.right:
                    stack.appendleft((cur.right, max(cur.right.val, curMax)))
                    if cur.right.val >= curMax:
                        count+=1
        return count

        