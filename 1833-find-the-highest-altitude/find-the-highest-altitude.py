class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        if len(gain) == 0:
            return 0
        else:
            ps=[0] * (len(gain)+1)
            highestAlt=0
            for i in range (1,len(gain)+1):
                ps[i]=ps[i-1] + gain[i-1]
                if ps[i] > highestAlt:
                    highestAlt = ps[i]
            print(ps)
        return highestAlt

        