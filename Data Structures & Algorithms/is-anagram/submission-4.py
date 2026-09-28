class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sorted1 = sorted(s)
        sorted2 = sorted(t)
        if(len(sorted1) != len(sorted2)):
            return False
        for i, c in enumerate(sorted1):
            if(sorted1[i] != sorted2[i]):
                return False
        return True
