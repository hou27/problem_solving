TEN = 10
result = []

for i in range(TEN):
    tmp = int(input()) % 42
    result.append(tmp)

result = list(set(result))
print(len(result))
