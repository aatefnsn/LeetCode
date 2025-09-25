from collections import deque
class Solution:
    def removeStars(self, s: str) -> str:
        dq = deque()
        arr=list(s)
        #print(arr)
        for i in range (len(arr)):
            dq.append(arr[i])
        #print(dq)
        for i in range (len(arr)):
            char=dq.popleft()
            if char == '*' and i == 0:
                continue
            elif char == '*':
                dq.pop()
            else:
                dq.append(char)
        #print(dq)
        index=0
        arr=[]
        while dq:
            arr.append(dq.popleft())
            index+=1
        #print(arr)
        return "".join(arr)