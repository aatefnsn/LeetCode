import re
class Solution:
    def toGoatLatin(self, sentence: str) -> str:
        #sentence="I love Ahmed"
        #print(sentence)
        #sentence2=sentence
        vowel=['a','e','i','o','u', 'A', 'E', 'I', 'O', 'U']
        words=sentence.split(" ")
        index=1
        for word in words:
            #if word[0] in vowel:
            if re.match('^[aeiouAEIOU]\w*',word):
                #word=word.split()
                word2=word+"ma"
                for i in range (index):
                    word2=word2+'a'
                print(word2)
                sentence = re.sub(rf'\b{word}\b', word2, sentence, count=1)
                #sentence=sentence.replace(rf'{word}',word2)
            elif re.match('^[^aeiouAEIOU]\w*',word):
                word2=word.strip()
                word2=word2[1:]+word2[0]+"ma"
                for i in range (index):
                    word2=word2+'a'
                print(word2)
                sentence = re.sub(rf'\b{word}\b', word2, sentence, count=1)
                #sentence=sentence.replace(rf'{word}',word2)
            index=index+1
        return sentence