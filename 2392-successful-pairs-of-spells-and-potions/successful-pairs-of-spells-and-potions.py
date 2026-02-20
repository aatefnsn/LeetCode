class Solution:
    def successfulPairs(self, spells: List[int], potions: List[int], success: int) -> List[int]:
        if not spells or not potions:
            return []
        else:
            potions.sort()
            print(potions)
            ans=[]
            for spell in spells:
                index=self.bs(potions,spell,success)
                ans.append(len(potions)-index if index != -1 else 0)
            '''
            ans=[]
            for i in range (len(spells)):
                count=0
                for j in range (len(potions)):
                    if spells[i] * potions[j] >= success:
                        count+=1
                        #break
                #count=len(potions)-j
                ans.append(count)
            '''
            return ans
    def bs (self,potions, spell, success):
        low=0
        high=len(potions)-1
        index=-1
        
        while low <=high:
            mid=(low+high)//2
            if potions[mid] * spell >= success:
                index=mid
                #low=middle
                high=mid-1
            else:
                low=mid+1
        return index
        
