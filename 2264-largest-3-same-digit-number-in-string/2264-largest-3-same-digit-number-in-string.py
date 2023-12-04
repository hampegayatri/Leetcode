class Solution:
    def largestGoodInteger(self, num: str) -> str:
        for i in range(9, -1, -1):
            candidate = str(i) * 3
            if candidate in num:
                return candidate
        return ""