class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        ''' TC: O(nlogn)
        return sorted(s) == sorted(t)
        '''

        # TC: O(n)
        counts = [0] * 26

        for ch in s:
            counts[ord(ch) - ord('a')] += 1
        
        for ch in t:
            counts[ord(ch) - ord('a')] -= 1

        if all(count == 0 for count in counts):
            return True
        return False
        
