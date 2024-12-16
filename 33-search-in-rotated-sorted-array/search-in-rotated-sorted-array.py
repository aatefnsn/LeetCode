class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left=0
        right=len(nums)-1

        while left<=right:
            mid=(left+right) // 2
            if nums[mid] == target:
                return mid

            if nums[mid] >= nums[left]: #left
                if nums[left] <= target and  nums[mid] > target:
                    right=mid-1
                else:
                    left=mid+1
            else:
                if nums[right] >= target and nums[mid] < target:
                    left=mid+1
                else:
                    right=mid-1
        return -1 
        '''
        left=0
        right=len(nums)-1
        while left <= right:
            mid=(left+right)//2
            if nums[mid] == target:
                return mid
            if nums[left] <= nums[mid]: #left side
                if target < nums[mid] and target>= nums[left]:
                    right=mid-1
                else:
                    left=mid+1
            else:
                if target <= nums[right] and target > nums[mid]:
                    left=mid+1
                else:
                    right=mid-1
        return -1
    '''
        