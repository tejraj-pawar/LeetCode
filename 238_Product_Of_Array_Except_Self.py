class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # TC: O(n), SC: O(1) because result array does not count
        n = len(nums)
        prefix_product = 1
        suffix_product = 1
        result = [1] * n

        # for prefix product
        for i in range(n):
            result[i] = prefix_product
            prefix_product *= nums[i]
        
        # for suffix product
        for i in range(n-1, -1, -1):
            result[i] *= suffix_product
            suffix_product *= nums[i]

        return result
