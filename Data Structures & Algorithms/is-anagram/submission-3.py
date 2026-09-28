class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        p = {}
        q = {}
        for c in s:
            if c in p:
                p[c] += 1
            else:
                p[c] = 1
        for c in t:
            if c in q:
                q[c] += 1
            else:
                q[c] = 1
        return p == q