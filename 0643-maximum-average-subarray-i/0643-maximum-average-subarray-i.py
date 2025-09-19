import sys
class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        if k > len(nums):
            return float(0)
        else:
            cur_total=nums[0]
            for i in range (1,k):
                cur_total+=nums[i]
            max_total=cur_total
            for i in range (k,len(nums)):
                cur_total=cur_total + nums[i] - nums[i-k]
                max_total=max(cur_total,max_total)
            return max_total / k
            
        

        '''
        if k > len(nums):
            return float(0)
        else:
            max_avg=nums[0]
            total=nums[0]
            for i in range (1,k):
                total+=nums[i]
                max_avg = float(total/k)
        #print("total is", total)
        #print("first max average is ", max_avg)
        #max_avg= -1 * sys.float_info.min
        total = 0
        for i in range (len(nums)-k+1): # 0, 1, 2
            total=0
            #print(i)
            j = i
            for j in range (j,j+k): # k = 0 
                #print(j)
                total+=nums[j]
            #print("total is ", total)
            if max_avg >=0: 
                max_avg=max(max_avg, (total/k))
                #print("max average is ",  max_avg)
            else:
                max_avg=min(max_avg,(total/k))
                #print("max average is ",  max_avg)
        return max_avg
        '''