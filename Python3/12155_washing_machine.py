weight = int(input())
if weight > 7000:
    print("OVERLOADED")
elif 1 <= weight <= 2000:
    print(25)
elif 2001<= weight and weight <= 4000:
    print(35)
elif 4001 <= weight and weight <= 7000:
    print(45)
elif weight == 0:
    print(0)
else:
    print("INVALID INPUT")