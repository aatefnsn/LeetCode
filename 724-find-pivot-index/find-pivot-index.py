class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        #1, 8,11,17,22,28
        #1,3,6
        ps= [0] * (len(nums)+1)
        for i in range (1, len(nums)+1):
            ps[i]=ps[i-1]+nums[i-1]
        print(ps)
        for i in range (1,len(ps)):
            if(ps[len(ps)-1] - ps[i] == ps[i-1]):
                return i-1

            '''
            for j in range (i+2, len(ps)):
                if ps[j] == 2 * ps[i]:
                    return i
                elif ps[j] == ps[i]:
                    return 0
            '''
        return -1