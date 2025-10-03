from collections import deque
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:

        stack=deque()
        visited=[]
        depths={}
        if not root:
            return 0
        else:
            #count=1
            stack.appendleft((root,1))
            depths[root]=1
            maxDepth=1
            while stack:
                cur,curDepth=stack.popleft()
                maxDepth=max(curDepth, maxDepth)
                #count+=1
                #print(cur.val)
                #visited.append(cur)
                #visited_level[cur]=count
                
                if cur.left:
                    stack.append((cur.left, curDepth+1))
                    depths[cur.left]=curDepth+1
                if cur.right:
                    stack.append((cur.right,curDepth+1))
                    depths[cur.right]=curDepth+1
            return maxDepth

