n = int(input())
if n < 3 or n > 50:
    exit()

current = 1
for i in range(1, n + 1):
    for j in range(i):
        print(current, end='')
        if j < i - 1:
            print(' ', end='')
        current += 1
    print()