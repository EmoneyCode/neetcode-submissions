class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        for i, num in enumerate(nums):
            a = target - num
            if a in map:
                return [map[a], i]
            map[num] = i
