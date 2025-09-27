from collections import deque
class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        l=[]
        stack=deque() # stack
        for i in range (len(asteroids)-1, -1, -1):
            #keep adding from list into stack
            stack.appendleft(asteroids[i])
            #print("stack now is ", stack)
            stackOk=False
            # loop to check the stsack and only exit that loop when no more collisions in the stack
            # keep checking the stack for collisions before you proceed to add more
            if len(stack) > 1:
                #print("stack size is more than one, let's check it")
                #cur=stack.popleft()
                #prev=stack.popleft()
                while not stackOk and len(stack) > 1:
                    cur=stack.popleft()
                    prev=stack.popleft()
                    if cur > 0 and prev < 0:
                        #print("collison")
                        if (cur == prev*-1):
                            #print("EQUAL POWERS! no winner")
                            #both are already removed
                            continue
                        else:
                            winner=max(cur,prev*-1)
                            if winner == cur:
                                stack.appendleft(cur)
                            else:
                                stack.appendleft(prev)
                    else:
                        #print("no collision")
                        stack.appendleft(prev)
                        stack.appendleft(cur)
                        stackOk = True
                        continue
            else: # stack size less than 2 no need to check
                continue
        while stack:
                l.append(stack.popleft())
        return l



        '''
        l=[]
        if not asteroids:
            return l
        else:
            q=deque()
            for i in range(len(asteroids)):
                q.append(asteroids[i])    
            print("Initial queue")        
            print(q)
            res=deque()
            res.appendleft(asteroids[-1])
            #print("res is ",  res)
            for i in range (len(asteroids)-2,-1, -1):
                #print("i is  ", i)
                #print("inside for loop")
                if res:
                    cur=res[0]
                else:
                    res.appendleft(asteroids[i])
                    continue
                prev=asteroids[i]
                print("res is ", res)
                if(prev > 0 and cur < 0): # prev positive and cur (top of stack) is negative
                    print("collison")
                    if (prev == cur*-1):
                        print("EQUAL POWERS! no winner")
                        res.popleft()
                    else:
                        winner=max(prev,cur*-1)
                        print("winner is ", winner)
                        if winner == cur*-1:
                            print("winner is cur")
                            continue
                        else: # winner is prev
                            print("winner is prev")
                            #print(res)
                            #res.popleft()
                            #print(res)
                            if (prev > 0 and res[0] < 0):
                                print("collin on adding, prev is ", prev, " and cur is ", res[0] )
                                if (prev == res[0]*-1):
                                    print("equal powers")
                                    res.popleft()
                                    continue
                                    #res.appendleft(prev)
                                else:
                                    print("no equal power on second collision")
                                    winner=max(prev,res[0]*-1)
                                    if winner == res[0]*-1:
                                        print("winner is the existing")
                                        continue
                                    else:
                                        print("winner is the newly added")
                                        res.popleft()
                                        print(res)
                                        print("adding", prev)
                                        res.appendleft(prev)



                            else:
                                res.popleft()
                                res.appendleft(prev)

                            #print(res)
                else: # no collision
                    print("no collision")
                    res.appendleft(prev)
                    print("res is ", res)
            while res:
                l.append(res.popleft())                
        return l
        '''

                    
        '''
            for i in range (len(asteroids)):
                if q:
                    cur=q.popleft()
                    nxt=q[0]
                    if(cur > 0 and nxt < 0): #cases for 0?
                        if (cur == nxt*-1):
                            print("EQUAL POWERS! no winner")
                            q.popleft()
                        else:
                            print("Brace for impact, COLLISION!")
                            winner=max(cur,nxt*-1)
                            print("winner is", winner)
                            if winner == cur:
                                q.append(winner)
                            else:
                                #q.popleft()
                                q.append(nxt)
                            
                            q.popleft()
                            print("after winnner q is ",q)
                    else:
                        print("no collision between ", cur, " and ", nxt)
                        if len(q) == 1:
                            q.appendleft(cur)
                        else:
                            q.append(cur)
                        #q.append(q.popleft())
                    print("q now is ", q)
                        #print(q)
            print("result: ", q)
            #print(q)
            while q:
                l.append(q.popleft())
           
            return l
        '''

        