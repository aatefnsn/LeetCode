class Solution:
    def myAtoi(self, s: str) -> int:
        if not s:
            return 0
        l=s.split(" ")
        print(l[:])
        for i in range (len(l)):
            if l[i]:
                print(l[i])
                break
        '''
        print("number is ", l[i])
        n=l[i]
        print("first number after leading space is ", n)
        if (n[0] == '-'):
            print("negative integer")
            result = ""
            for j in range(1,len(n)):
                if j == 1 and n[j] == '+':
                    return 0
                if n[j].isdigit():
                    result += n[j]
                else:
                    break
            try:
                result=int(result) * -1
                return max(-2**31 , min(int(result), 2**31)) if result else 0
            except:
                return 0
            #return int(result)*-1 if result else 0
        elif (n[0] != '-' or n[0]== '+'):
            print("positive integer")
            result = ""
            if n[0] == '+':
                m=1
            else:
                m=0
            for j in range(m,len(n)):
                if n[j].isdigit():
                    result += n[j]
                else:
                    break
            return max(-2**31, min(int(result), 2**31 )) if result else 0
            #return int(result) if result else 0
        else:
            return 0
        return 0
        '''
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        n=len(s)
        if i == n:
            return 0
        
        # Step 2: Check for sign
        sign = 1
        if s[i] == '+':
            i += 1
        elif s[i] == '-':
            sign = -1
            i += 1
        
        # Step 3: Read digits and convert
        res = 0
        result = ""
        while i < n and s[i].isdigit():
            digit = int(s[i])
            result=result+str(int(s[i]))
            res = res * 10 + digit
            
            if sign * res <= INT_MIN:
                return INT_MIN
            if sign * res >= INT_MAX:
                return INT_MAX
            
            i += 1
        
        # Step 4: Apply sign and return
        return res * sign
        