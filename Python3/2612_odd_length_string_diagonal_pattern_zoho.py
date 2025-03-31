s = input().strip()
l = len(s)

for i in range(l):
    line = [" "] * l
    line[i] = s[i]
    line[l - i - 1] = s[l - i - 1]
    print("".join(line))