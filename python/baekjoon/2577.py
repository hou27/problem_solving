num = 1
countList = list(map(int, ("0" * 10)))

for i in range(3):
    num = num * int(input())

num = str(num)

for i in range(len(num)):
    countList[int(num[i])] += 1

for i in range(10):
    print(countList[i])
