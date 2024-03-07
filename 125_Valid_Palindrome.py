class Solution:
    def isPalindrome(self, s: str) -> bool:
        # TC: O(n), SC: O(n)
        s1 = []
        for word in s:
            if word.isalnum():
                s1.append(word)
        s = "".join(s1).lower()

        low = 0
        high = len(s) - 1

        while low < high:
            if s[low] == s[high]:
                low += 1
                high -= 1
            else:
                return False
        return True   
        
