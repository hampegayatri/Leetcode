class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:

        for ind, val in enumerate(points):
            points[ind] = val[0]
        points.sort(reverse=True)

        for i in range(1, len(points)):
            points[i-1] = points[i-1] - points[i]
        
        return max(points[:-1])