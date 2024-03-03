class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ''' TC: O(n^2)
        l = len(nums)
        for i in range(l):
            for j in range(i + 1, l):
                if nums[j] == target - nums[i]:
                    return [i, j]
        '''
        # TC: O(n), SC: O(n)
        track = {}
        for i, num in enumerate(nums):
            diff = target - num
            if diff in track:
                return [track[diff], i]
            track[num] = i
