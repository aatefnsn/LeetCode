from collections import deque
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        if not root:
            return 0
        else:
            count = 0
            stack = deque()
            # Push (node, prefixSum, is_backtracking)
            stack.append((root, root.val, False))
            hm = []  # List to track prefix sums on current path
            
            hm = {0: 1}  # Dict to track prefix sums: sum -> count (0:1 is base case)
        
            while stack:
                cur, prefixSum, is_backtracking = stack.pop()
                
                if is_backtracking:
                    # Going back up - remove this prefix sum
                    hm[prefixSum] -= 1
                    if hm[prefixSum] == 0:
                        del hm[prefixSum]
                    continue
                
                # Going down - check if we found a path
                # If currentSum - previousSum = targetSum, then previousSum = currentSum - targetSum
                needed = prefixSum - targetSum
                
                if needed in hm:
                    count += hm[needed]
                
                # Add current prefix sum to hashmap
                hm[prefixSum] = hm.get(prefixSum, 0) + 1
                
                # Push backtracking marker for this node
                stack.append((cur, prefixSum, True))
                
                # Push children (right first so left is processed first in DFS order)
                if cur.right:
                    stack.append((cur.right, prefixSum + cur.right.val, False))
                if cur.left:
                    stack.append((cur.left, prefixSum + cur.left.val, False))
            
            return count