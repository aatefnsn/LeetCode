from collections import deque 
class Solution:
    def predictPartyVictory(self, senate: str) -> str:
        dq= deque()
        rq=deque()
        l=list(senate)
        for i in range (len(l)):
            if l[i] == 'R':
                rq.append(i)
            else:
                dq.append(i)
        #print("QD is ", dq)
        #print("RQ is ", rq)
        index=len(l)
        #print("index is ", index)
        
        while dq and rq:
            if dq[0] < rq[0]: #dq is winner
                #print("D wins")
                rq.popleft()
                dq.popleft()
                dq.append(index)
                
            else:
                #print("R wins")
                dq.popleft()
                rq.popleft()
                rq.append(index)
            #print("QD is ", dq)
            #print("RQ is ", rq)  
            index+=index

        if dq:
            return "Dire"
        else:
            return "Radiant"
        
        #return ""

        