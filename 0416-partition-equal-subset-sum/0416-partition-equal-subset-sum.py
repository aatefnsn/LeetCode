class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        summ=0
        possiblesums={0}
        #possiblesums.add(0)
        for i in nums:
            summ=summ+i
        target=summ/2
        print(target)
        if (int)(summ % 2) != 0:
            print("odd sum!")
            return False
        else:
            print("even sum")
            #target=(int)target
            for i in nums:
                print(i)
                possiblesums2={0}
                for j in possiblesums:
                    if j + i == target:
                        return True
                    print(j)
                    possiblesums2.add(j+i)
                for i in possiblesums2:
                    possiblesums.add(i)
                    

        
        return False