invalid_count = 0

while True:
    number = input().strip()
    
    if number.lower() == 'q':
        break
    
    if not (len(number) == 10 and number.isdigit()):
        invalid_count += 1

print(invalid_count)