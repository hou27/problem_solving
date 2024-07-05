X = int(input())

# X가 몇 번째 대각선에 위치하는지 탐색.
line = 1
while X > line:
    X -= line
    line += 1

# 해당 대각선에서 X번째에 위치하는 분수를 계산
denominator = X
numerator = line + 1 - X

# 만약 line이 짝수라면, 분자와 분모의 위치를 바꾼다.
if line % 2 == 0:
    denominator, numerator = numerator, denominator

print(numerator, '/', denominator, sep='')