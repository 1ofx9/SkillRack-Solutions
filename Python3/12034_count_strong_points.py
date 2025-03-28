def is_strong_point(matrix, row, col, rows, cols):

    current = matrix[row][col]
    
    directions = [
        (-1,-1), (-1,0), (-1,1),
        (0,-1),          (0,1),
        (1,-1),  (1,0),  (1,1)
    ]
    
    for dx, dy in directions:
        new_row, new_col = row + dx, col + dy
        if (0 <= new_row < rows and 
            0 <= new_col < cols and 
            matrix[new_row][new_col] >= current):
            return False
    return True


R, C = map(int, input().split())
strong_points_count = 0
matrix = []

for _ in range(R):
    row = list(map(int, input().split()))
    matrix.append(row)


for i in range(R):
    for j in range(C):
        if is_strong_point(matrix, i, j, R, C):
            strong_points_count += 1


print(strong_points_count)