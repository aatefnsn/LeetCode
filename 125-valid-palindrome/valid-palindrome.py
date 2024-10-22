import re
class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s) > 0:
            s=re.sub('[^A-Za-z0-9]*','',s).lower()
            start=0
            end=len(s)-1
            print(s)
            while start <=end:
                if s[start] != s[end]:
                    return False
                elif s[start]==s[end]:
                    start=start+1
                    end=end-1
                else:
                    return False
           
        return True