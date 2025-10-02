from collections import deque
class Solution:
    def decodeString(self, s: str) -> str:
        l = list(s)
        #print(l)
        if not '[' and not ']' in l:
            #print("no square brackets")
            return ""
        else:
            q=deque()
            ans=""
            for i in range (len(l)):
                if l[i] != ',':
                    q.append(l[i])
            #print(q)
            q2=deque()
            while q:
                count=""
                q2.appendleft(q.pop())
                if q2[0] == '[':
                    #print("found open bracket")
                    q2.popleft() # remove open bracket
                    '''
                    count=int(q[-1])
                    q.pop()
                    '''
                    
                    #if q[-1].isdigit():
                    #while int(q[-1]) >= 0 and int(q[-1]) <=9:
                    while len(q) != 0 and q[-1].isdigit():
                        #print("integer is ", q[-1])
                        count=q[-1]+count
                        q.pop()
                    
                    #print("count is ", count)
                    count=int(count)
                    tempq=deque()
                    while q2[0] != ']':
                        tempq.appendleft(q2.popleft())
                    q2.popleft() # remove the closing ] from q2
                    #print("temp queue is ", tempq)
                    for i in range (count):
                        for item in tempq:
                            q2.appendleft(item)
                    #print(q2)
            while q2:
                ans=ans+q2.popleft()
            return ans
        '''
        ] print (reading string until [)
        bc # keep appending to a temp char list
        [
        2 get the number 

        for loop add the char list in a queue 
        
        bcbc
        '''