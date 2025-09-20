class Solution:
    def countVowels(self, s: str) -> int:
        count = 0
        arr = list(s)
        for i in range(len(arr)):
            if (
                arr[i] == "a"
                or arr[i] == "e"
                or arr[i] == "i"
                or arr[i] == "o"
                or arr[i] == "u"
            ):
                count += 1
        return count
    def maxVowels(self, s: str, k: int) -> int:
        maxVowels = 0
        curVowels = 0
        if k > len(s):
            return 0
        else:
            arr=list(s)
            curVowels=0
            #count number of vowel in the first k caracters
            #curVowelsVount
            for i in range(k): # 0 --> k-1
                if arr[i] == "a" or arr[i] == "e" or arr[i] == "i" or arr[i] == "o" or arr[i] == "u":
                    curVowels+= 1
            #print("Vowels count is the first k elements is ", curVowels)
            #for j in range (1,len(arr)-k+1): # maybe needs +1
            #    if(arr[j])
            maxVowels=curVowels
            for j in range (k, len(arr)): # 3 --> 7
                if arr[j] == "a" or arr[j] == "e" or arr[j] == "i" or arr[j] == "o" or arr[j] == "u":
                    curVowels+= 1
                if arr[j-k] == "a" or arr[j-k] == "e" or arr[j-k] == "i" or arr[j-k] == "o" or arr[j-k] == "u":
                    curVowels-=1
                maxVowels=max(maxVowels,curVowels)
            return maxVowels


            #start a sliding window, 
            #drop one character and add a new one and adjust the curVowelsCount
            
            #adjust maxVowelsCount

    def maxVowels2(self, s: str, k: int) -> int:
        maxVowels = 0
        curVowels = 0
        if k > len(s):
            return 0
        else:
            arr = list(s)
            for i in range(len(arr) - k + 1):
                curVowels=0
                #print("substring is", arr[i : i + k])
                #strr = "".join(arr[i : i + k])
                #curVowels = countVowels(strr)
                for j in range(i,i+k):
                    if (arr[j] == "a" or arr[j] == "e" or arr[j] == "i" or arr[j] == "o" or arr[j] == "u"):
                        curVowels+= 1
                maxVowels=max(curVowels,maxVowels)
                #print("Vowels count is ", curVowels)
        return maxVowels
