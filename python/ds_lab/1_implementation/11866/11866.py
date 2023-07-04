N, K = map(int, input().split())

people = [i for i in range(1, N + 1)] # 1 ~ N
result = [] # 제거된 순서대로 담길 리스트

num = 0 # 제거될 사람의 인덱스 번호

while len(people) > 0:
    num = (num - 1 + K) % len(people)
    result.append(people.pop(num))

print("<", end='')
for i in range(len(result) - 1):
    print(result[i], end=', ')
print(result[-1], ">", sep='')