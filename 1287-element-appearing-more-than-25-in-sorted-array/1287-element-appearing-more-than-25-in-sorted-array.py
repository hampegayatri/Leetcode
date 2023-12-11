class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        return statistics.mode(arr)