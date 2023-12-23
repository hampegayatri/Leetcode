class Solution:
    def isPathCrossing(self, path: str) -> bool:
        x = 0
        y = 0
        visited = {(0, 0)}

        for i in path:
            if i == "N":
                y += 1
            elif i == "S":
                y -= 1
            elif i == "E":
                x += 1
            elif i == "W":
                x -= 1
            
            current_position = (x, y)
            if current_position in visited:
                return True
            
            visited.add(current_position)

        return False