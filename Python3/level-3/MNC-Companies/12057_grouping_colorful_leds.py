def count_color_groups(colors):
    colors = colors.split()
    n = len(colors)
    count = 0
    
    for i in range(n):
        for j in range(i, n):
            if colors[i] == colors[j]:
                count += 1    
    return count

colors = input().strip()
print(count_color_groups(colors))