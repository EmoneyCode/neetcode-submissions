class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mapSum = {}
        left = 0
        right = len(nums) - 1
        for i, num in enumerate(nums):
            difference = target - num
            if difference in mapSum:
                return [mapSum[difference], i]
            mapSum[num] = i
        return []