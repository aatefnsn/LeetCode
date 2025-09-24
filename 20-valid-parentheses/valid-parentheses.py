class Solution:
    def isValid(self, s: str) -> bool:
        # go over brackets one by one
        # if an open bracket
        # add to the stack
        # if a closed bracket, pop the last one from stack
        # if the last pop is not matching, return false
        # if the last pop is matching, remove both
        # at the end look at the stack, if there are brackets left, return fasle else return true (empty stack)
        arr=list(s)
        if len(arr) == 0:
            return True
        elif len(arr) == 1:
            return False
        else:
            #print(arr)
            stack=[]
            for i in range (len(arr)):
                if arr[i] == '(' or arr[i] == '[' or arr[i] == '{':
                    stack.append(arr[i])
                elif (arr[i] == ')' or arr[i] == ']' or arr[i] == '}') and len(stack) != 0:
                    lastOpenBracket=stack.pop()
                    if lastOpenBracket == '(' and arr[i] == ')':
                        continue
                    elif lastOpenBracket == '[' and arr[i] == ']':
                        continue
                    elif lastOpenBracket == '{' and arr[i] == '}':
                        continue
                    else:
                        return False
                else:
                    return False
        return True if len(stack) == 0 else False
        