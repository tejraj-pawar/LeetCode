class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        ''' TC: O(n^2) SC: O(1)
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] == nums[j]:
                    return True
                
        return False
        '''
        # TC: O(n) SC: O(n)
        hashSet = set()
        for num in nums:
            if num in hashSet:
                return True
            hashSet.add(num)
        return False
        ''' TC: O(nlogn) SC: O(1)
        nums.sort() # O(nlogn)
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                return True
        return False
        '''
