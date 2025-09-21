class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans=[]
        hm={}
        for i in range (len(nums)):
           hm[i]=nums[i]
        for i in range (len(nums)):
            #if target != 0:
            if nums[i] >= target and target != 0 and target > 0: 
                continue
            else:
                if target-nums[i] in hm.values():
                    print("found remaining value ",  target-nums[i], "in the hash map")
                    for key,value in hm.items():
                        if value == target-nums[i] and key != i:
                            return [i,key]
                        else:
                            continue
        